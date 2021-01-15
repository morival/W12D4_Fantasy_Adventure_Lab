package character.warriors;

import components.armours.Armour;
import components.weapons.Weapon;

public class Dwarf extends Warrior {

    public Dwarf(String name, Armour armour, Weapon weapon){
        super(name, 31, 700, armour, weapon);
    }

//    public void craftNewWeapon(String name, String type, int damageValue){
//        Weapon weapon = new Weapon(name, type, damageValue);
//        this.inventory.add(weapon);
//    }
}
