package components.creatures;

import components.Item;

public class Creature extends Item {

    private CreatureType creatureType;

    public Creature(String name, CreatureType creatureType){
        super(name);
        this.creatureType = creatureType;
    }

    public int getDamageValue(){
        return this.creatureType.getDamageValue();
    }

    public CreatureType creatureType() {return creatureType;}
}
