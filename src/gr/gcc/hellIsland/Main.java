package gr.gcc.hellIsland;

        import gr.gcc.hellIsland.Command.UserInput;
        import gr.gcc.hellIsland.Domain.Door;
        import gr.gcc.hellIsland.Domain.Player;
        import gr.gcc.hellIsland.Domain.Room;
        import gr.gcc.hellIsland.Invetory.*;
        import gr.gcc.hellIsland.Parser.Parser;
        import gr.gcc.hellIsland.UI.DisplayMenu;
        import gr.gcc.hellIsland.UI.MainMenu;

        import static java.lang.String.valueOf;

public class Main {


    private static MainMenu mainMenu = new MainMenu();
    private static String decision;
    private static boolean gameOver = true;
    private static DisplayMenu displayMenu = new DisplayMenu();
    private static UserInput input = new UserInput();
    private static String[] token = new String[2];



    public static void main(String[] args){

        //Player Creation
        Player player = new Player();

        //Parser Creation
        Parser parser = new Parser();


        //Room-Door1 Creation

        Door door1 = new Door(1);
        Door door2 = new Door(2);
        Door door3 = new Door(3);
        Door door4 = new Door(4);
        Door door5 = new Door(5);


        Room room1 = new Room("Mainland",door1,false);
        Room room2 = new Room("Plane",door2,false);
        Room room3 = new Room("Sea",door3,false);
        Room room4 = new Room("Forrest",door4,false);
        Room room5 = new Room("Cave",door5,false);


        //Room Connections
        room1.putLeftOf(room2);
        room2.putRightOf(room1);
        room1.putUpOf(room3);
        room3.putDownOf(room1);
        room1.putDownOf(room4);
        room4.putUpOf(room1);
        room5.putLeftOf(room4);
        room4.putRightOf(room5);


        Item sword = new Weapon("Sword",10,true);
        Item key4 = new Key(4,true);
        Item key5 = new Key(5,true);

        ///Room Inventories

        Inventory room1Inventory = new Inventory();
        room1Inventory.addToInventory(sword);
        room1.setRoomInventory(room1Inventory);

        Inventory room2Inventory = new Inventory();
        room2Inventory.addToInventory(key4);
        room2.setRoomInventory(room2Inventory);

        Inventory room3Inventory = new Inventory();
        Item shark = new Food("shark",10,true,true);
        Item crab= new Food("crab",10,true,true);
        Item mussel = new Food("mussel",10,true,true);
        Item octapus = new Food("octapus",10,true,true);
        Item squid = new Food("squid",10,true,true);
        room3Inventory.addToInventory(shark);
        room3Inventory.addToInventory(crab);
        room3Inventory.addToInventory(mussel);
        room3Inventory.addToInventory(octapus);
        room3Inventory.addToInventory(squid);
        room3.setRoomInventory(room3Inventory);


        Inventory room4Inventory = new Inventory();
        Item coconut = new Food("coconut",10,true,true);
        room4Inventory.addToInventory(coconut);
        room4.setRoomInventory(room4Inventory);

        Inventory room5Inventory = new Inventory();
        Item excalibur = new Weapon("excalibur(The flaming sword of destruction)",9999,true);
        room5Inventory.addToInventory(excalibur);
        room5.setRoomInventory(room5Inventory);

        Inventory playerInvetory = new Inventory();
        player.setPlayerInventory(playerInvetory);



        mainMenu.gameMenu();
        displayMenu.showOption();
        decision = input.getInput().toLowerCase().trim();

        while(gameOver){
            if(decision.equals("new game")){
                player.setStartingRoom(room2);
                parser.setPlayer(player);
                parser.setInventory(player.getPlayerInventory());
                gameOver=false;
                displayMenu.newGameStarting();
                displayMenu.showStory();

            }
            else if(decision.equals("load game")){
                gameOver=false;
                mainMenu.loadGame();
                parser.setPlayer(player);
        }
            else if(decision.equals("exit")){
                mainMenu.exitGame();
            }
            else{
                displayMenu.showWrongOption();
                mainMenu.gameMenu();
                decision=input.getInput();
            }
        }




        //Game Loop
        while(!gameOver){
            displayMenu.showHelp();
            displayMenu.showCurrentLocation(player);
            displayMenu.showOption();
            decision=input.getInput();
            token = input.Tokenizer(decision.toLowerCase().trim());
            parser.commandToDo(token);
        }
    }
}
