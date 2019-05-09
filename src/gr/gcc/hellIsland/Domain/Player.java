package gr.gcc.hellIsland.Domain;

import gr.gcc.hellIsland.Command.Command;
import gr.gcc.hellIsland.Command.Direction;
import gr.gcc.hellIsland.Invetory.AvailableItems;
import gr.gcc.hellIsland.Invetory.Inventory;
import gr.gcc.hellIsland.Invetory.Item;
import gr.gcc.hellIsland.Invetory.Key;

import java.util.Collection;

public class Player implements Command{
    private  Room currentRoom;
    private  Room next;
    private Inventory playerInventory = new Inventory();

    @Override
    public String move(Direction direction) {
            next = currentRoom.roomTo(direction);
        try {
            if (next != null && next.roomAccess() == false) {
                currentRoom = next;
                return "You move " + direction + '.';
            }
            else {
            return "There is a door with Id: " + next.getDoorid() + " that blocks you";
        }
        } catch (NullPointerException e) {
            return "There is nothing there";
        }
    }

    @Override
    public Item pickup(AvailableItems nameOfItem) {
//        Item requested = playerInventory.getItem(nameOfItem);
//        playerInventory.addToInventory(requested);
//        return requested;
        return  null;
    }


    public void setStartingRoom(Room room){
        currentRoom = room;
}


    public String nameOfCurrentRoom(){
        return currentRoom.getName();
    }

    public int doorIdOfCurrentRoom(){
        return currentRoom.getDoorid();
    }


    public Collection<Direction> possibleDirections(){
        return currentRoom.possibleDirections(); //method from Class Room
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void doorUnlock(Item key) {
        if (key.getId(key) == next.getDoorid()) {
            next.setDoorUnlocked(true);
        }
    }

    public void setPlayerInventory(Inventory playerInventory){
        this.playerInventory = playerInventory;
    }

    public Inventory getPlayerInventory(){
        return this.playerInventory;
    }

    public Inventory getRoomInventory(){
        return currentRoom.getRoomInventory();
    }

    public void setRoomInventory(Inventory roomInventory){
        currentRoom.setRoomInventory(roomInventory);
    }
}
