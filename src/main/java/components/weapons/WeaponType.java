package components.weapons;

public enum WeaponType {

    AXE(3),
    SWORD(5),
    WARHAMMER(4);

    private final int damageValue;

    WeaponType(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

}
