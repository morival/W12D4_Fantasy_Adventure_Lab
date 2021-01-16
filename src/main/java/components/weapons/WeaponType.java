package components.weapons;

public enum WeaponType {

    NON(0),
    AXE(3),
    SWORD(5),
    CLAYMORE(6),
    WARHAMMER(4),
    BATTLEAXE(5),
    DAGGER(1),
    CLUB(1),
    MACE(3);

    private final int damageValue;

    WeaponType(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

}
