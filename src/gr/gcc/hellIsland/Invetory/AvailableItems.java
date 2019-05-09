package gr.gcc.hellIsland.Invetory;

public enum  AvailableItems implements Item {
    shark,crab,mussel,octapus,squid,sword,key4,key5,excalibur;

    @Override
    public boolean pickable(Item pick) {
        return false;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int getId(Item item) {
        return 0;
    }

    @Override
    public String getDescription(Item item) {
        return null;
    }

    @Override
    public int getlifePoints(Item item) {
        return 0;
    }
}
