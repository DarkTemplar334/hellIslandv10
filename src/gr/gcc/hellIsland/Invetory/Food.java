package gr.gcc.hellIsland.Invetory;
public class Food implements Item{

    private String description;
    private int lifePoints;
    private boolean pickable;
    private boolean edible;

    public Food(String description, int lifePoints, boolean pickable, boolean edible) {
        this.description = description;
        this.lifePoints = lifePoints;
        this.pickable = pickable;
        this.edible = edible;
    }


    public int getLifePoints() {
        return this.lifePoints;
    }

    @Override
    public boolean pickable(Item pick) {
        return pickable;
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
        return this.description;
    }

    @Override
    public int getlifePoints(Item item) {
        return this.lifePoints;
    }
}
