package components.creatures;

public enum CreatureType {

    SMAUG(6);

    private final int damageValue;

    CreatureType(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
