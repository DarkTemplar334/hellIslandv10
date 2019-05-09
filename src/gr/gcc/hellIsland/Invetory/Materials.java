package gr.gcc.hellIsland.Invetory;

public class Materials implements Item{

    private String description;
    private boolean pickable;

    public Materials(String description, boolean pickable) {
        this.description = description;
        this.pickable = pickable;
    }

    @Override
    public boolean pickable(Item pick) {
        return true;
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
