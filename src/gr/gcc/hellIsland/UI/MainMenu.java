package gr.gcc.hellIsland.UI;


import gr.gcc.hellIsland.Domain.Player;
import gr.gcc.hellIsland.Domain.Room;

import java.io.*;

public class MainMenu {

    private Player player;
    private Room currentRoom;

    public void gameMenu() {
        System.out.println("\n====================");
        System.out.println("\t New Game");
        System.out.println("\t Load Game");
        System.out.println("\t Exit");
        System.out.println("====================\n\n");
        System.out.println("\n====Type Command as you see them!!====");
    }

    public Room loadGame(){
//        try{
//            FileInputStream saveFile = new FileInputStream("saveFile.txt"); //opening file
//            ObjectInputStream loadGame = new ObjectInputStream(saveFile);
//            //player = (Player) loadGame.readObject();
//            currentRoom = (Room) loadGame.readObject();
//            loadGame.close();
//        }
//        catch (Exception exc){
//            exc.printStackTrace();
//
//        }

        System.out.println("You've gone back a bit.....");
        //player inputStream
        return this.currentRoom;
    }

    public void saveGame(Player player,Room currentRoom){

//        try{
//            FileOutputStream saveFile = new FileOutputStream("saveFile.txt"); // anoigma arxeiou
//            ObjectOutputStream saveGame = new ObjectOutputStream(saveFile); //antikeimeno gia pros8hkh sto arxeio
//            saveGame.writeObject(player);
//            saveGame.writeObject(currentRoom);
//            saveGame.close();
//        }catch (Exception exc){
//            exc.printStackTrace(); // an uparxei uparxei error bgazei to log
//        }
        this.player=player;
        this.currentRoom=currentRoom;
        System.out.println("Game Saved");

    }

    public void exitGame(){
        System.exit(0);

    }


}
