package gr.gcc.hellIsland.Invetory;

import gr.gcc.hellIsland.Invetory.Item;

public class Weapon implements Item {

    private String description;
    private int damage;
    private boolean pickable;

    public Weapon(String description, int damage, boolean pickable) {
        this.description = description;
        this.damage = damage;
        this.pickable = pickable;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isPickable(){
        return pickable;
    }

    public String getItemName(){
        return description;
    }


    @Override
    public boolean pickable(Item pick) {
        return isPickable();
    }

    @Override
    public int attack() {
        return getDamage();
    }

    @Override
    public int getId(Item item) {
        return 0;
    }

    @Override
    public String getDescription(Item item) {
        return description;
    }

    @Override
    public int getlifePoints(Item item) {
        return 0;
    }


}
