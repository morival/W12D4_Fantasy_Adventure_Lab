package character.warriors;

import components.armours.Armour;
import components.weapons.Weapon;

public class Barbarian extends Warrior {

    public Barbarian(String name, int hp, Armour armour, Weapon weapon){
        super(name, 200, armour, weapon);
    }
}
