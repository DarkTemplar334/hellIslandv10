package gr.gcc.hellIsland.Command;

import gr.gcc.hellIsland.Invetory.AvailableItems;
import gr.gcc.hellIsland.Invetory.Item;

public interface Command {

    String move(Direction direction);

    Item pickup(AvailableItems nameOfAvailableItem);

}
