package components.treasures;

import components.Item;

public class Treasure extends Item {

    private TreasureType treasureType;

    public Treasure(String name, TreasureType treasureType) {
        super(name);
        this.treasureType = treasureType;
    }

}
