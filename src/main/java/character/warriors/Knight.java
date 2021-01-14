package character.warriors;

import components.armours.Armour;
import components.weapons.Weapon;

public class Knight extends Warrior {

    public Knight(String name, int hp, Armour armour, Weapon weapon){
        super(name, 250, armour, weapon);
    }
}
