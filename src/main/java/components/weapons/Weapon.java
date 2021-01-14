package components.weapons;

import components.Item;

public class Weapon extends Item {

    private WeaponType weaponType;

    public Weapon(String name, WeaponType weaponType) {
        super(name);
        this.weaponType = weaponType;
    }

    public int getDamageValue() {
        return this.weaponType.getDamageValue();
    }

    public WeaponType getType() {
        return weaponType;
    }
}
