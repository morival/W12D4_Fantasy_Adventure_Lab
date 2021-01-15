package character.warriors;

import character.Player;
import components.armours.Armour;
import components.armours.ArmourType;
import components.weapons.Weapon;
import components.weapons.WeaponType;
import interfaces.IFight;

public abstract class Warrior extends Player implements IFight {

    private Armour armour;
    private Weapon weapon;

    public Warrior(String name, int attack, int hp, Armour armour, Weapon weapon){
        super(name, attack, hp);
        this.armour = armour;
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public ArmourType getArmourType() {
        return this.armour.getType();
    }

    public int getArmourStrength() {
        return this.armour.getArmourStrength();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public WeaponType getWeaponType(){
        return this.weapon.getType();
    }

    public int getWeaponDamage(){
        return this.weapon.getDamageValue();
    }

    public int getTotalDamage() {
        int totalDamage = getAttack() + getWeaponDamage();
        return totalDamage;
    }
}
