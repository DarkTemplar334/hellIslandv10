package gr.gcc.hellIsland.Invetory;
import java.util.*;

public class Inventory {

   private List<Item> inventory = new ArrayList<>(100);
   private Item itemSlot;
   private int itemSpot=0;

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public List<String> getInvetory() {
        List<String> weaponList = new ArrayList<>();
        List<String> keyList = new ArrayList<>();
        List<String> foodList = new ArrayList<>();
        List<String> itemList = new ArrayList<>();

        for (int i=0;i<inventory.size();i++){
            if(inventory.get(i) instanceof Key ){
                itemSlot = inventory.get(i);
                keyList.add(String.valueOf(itemSlot.getId(itemSlot)));
            }
            else if(inventory.get(i) instanceof Weapon) {
                itemSlot = inventory.get(i);
                weaponList.add(itemSlot.getDescription(itemSlot));
            }
            else if(inventory.get(i) instanceof Food){
                itemSlot = inventory.get(i);
                foodList.add(itemSlot.getDescription((itemSlot)));
            }
        }
        if(weaponList!=null){
            itemList.add("Weapon(s)" + weaponList);
        }
        if(itemList!=null){
            itemList.add("key(s) with id: " + keyList);
        }
        if(foodList!=null){
            itemList.add("You get to eat: "+ foodList);
        }
        return itemList;
    }


//    public int searchInventory(Item item) {
//            boolean found;
//            found=inventory.contains(item);
//            return found;
//    }

    public void sizelist() {
        inventory.size();
    }

    public void dropItem(Item item){
        inventory.remove(item);
    }

    public void pickup(Item item){
        inventory.add(item);
    }

    @Override
    public String toString() {
        return "Inventory{" + inventory + '}';
    }

    //public Item getItem(AvailableItems item) {
        //Item requested = inventory.get();
        //return item;
        //}

}