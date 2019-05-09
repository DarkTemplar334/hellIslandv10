package gr.gcc.hellIsland.Invetory;
public interface Item {




    boolean pickable(Item pick);
    int attack();
    int getId(Item item);
    String getDescription(Item item);
    int getlifePoints(Item item);



}
