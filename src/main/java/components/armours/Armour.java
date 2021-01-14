package components.armours;

import components.Item;

public class Armour extends Item {

    private ArmourType armourType;

    public Armour(String name, ArmourType armourType){
        super(name);
        this.armourType = armourType;
    }

    public int getArmourStrength(){ return this.armourType.getArmourStrength(); }

    public ArmourType getType() {return armourType;}
}
