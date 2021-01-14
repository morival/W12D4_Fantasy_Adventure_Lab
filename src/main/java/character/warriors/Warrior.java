package character.warriors;

import character.Player;
import components.armours.Armour;
import components.armours.ArmourType;
import components.weapons.Weapon;
import components.enemies.Enemy;
import components.weapons.WeaponType;

public abstract class Warrior extends Player {

    private Armour armour;
    private Weapon weapon;

    public Warrior(String name, int hp, Armour armour, Weapon weapon){
        super(name, hp);
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

    public void fightEnemy(Enemy enemy){
        enemy.reduceHP(weapon.getDamageValue());
    }
    // ^^ Should this be an IAttack along with Spells? ^^
}
