package components.herbs;

public enum HerbType {

    DEATHBELL(10),
    NIGHTSHADE(20),
    TAPROOT(30);

    private final int healingValue;

    HerbType(int healingValue){
        this.healingValue = healingValue;
    }

    public int getHealingValue() {
        return healingValue;
    }
}
