package gr.gcc.hellIsland.Domain;

import gr.gcc.hellIsland.Command.Direction;
import gr.gcc.hellIsland.Invetory.Inventory;
import gr.gcc.hellIsland.Invetory.Item;

import java.util.*;

public class Room{

    private  String name;
    private final Map<Direction, Room> possibleDirections = new HashMap<>();
    //private List<Door1> list = new ArrayList<>();
    private Door roomAccess;
    private Inventory roomInventory;

    //Something like inventory here




    public Room(String name,Door accessToRoom,boolean isLocked){
        this.name = name;
        this.roomAccess = accessToRoom;
        roomAccess.setLocked(isLocked);
    }

    public String getName(){
        return name;
    }

    public Room putRightOf(Room sideRoom){
        sideRoom.possibleDirections.put(Direction.right,this);
        return this;
    }

    public Room putLeftOf(Room sideRoom){
        sideRoom.possibleDirections.put(Direction.left,this);
        return this;
    }

    public Room putUpOf(Room sideRoom){
        sideRoom.possibleDirections.put(Direction.up,this);
        return this;
    }

    public Room putDownOf(Room sideRoom){
        sideRoom.possibleDirections.put(Direction.down,this);
        return this;
    }

    public Collection<Direction> possibleDirections(){
        return Collections.unmodifiableCollection(possibleDirections.keySet());
    }

    public Room roomTo(Direction direction){
        return possibleDirections.get(direction);
    }

    public boolean roomAccess(){
        return roomAccess.isLocked();
    }
    public int getDoorid(){
        return roomAccess.getDoorId();
    }

    public void setDoorUnlocked(boolean doorState){
        roomAccess.setLocked(doorState);
    }

    public void setRoomInventory(Inventory roomInventory){
        this.roomInventory = roomInventory;
    }

    public Inventory getRoomInventory(){
        return this.roomInventory;
    }


}
