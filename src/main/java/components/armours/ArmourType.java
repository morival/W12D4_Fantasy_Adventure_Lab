package components.armours;

public enum ArmourType {

    CHAINMAIL(20),
    IRON(30),
    STEEL(40),
    DAEDRIC(50);

    private final int armourStrength;

    ArmourType(int armourStrength){
        this.armourStrength = armourStrength;
    }

    public int getArmourStrength(){
        return armourStrength;
    }
}
