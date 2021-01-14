package components.herbs;

import components.Item;

public class Herb extends Item {

    private HerbType herbType;

    public Herb(String name, HerbType herbType){
        super(name);
        this.herbType = herbType;
    }
}
