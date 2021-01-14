package components.potions;

import components.Item;

public class Potion extends Item {

    private PotionType potionType;

    public Potion(String name, PotionType potionType){
        super(name);
        this.potionType = potionType;
    }

    public int getPotionValue(){
        return this.potionType.getPotionValue();
    }

    public PotionType potionType() {return potionType;}
}
