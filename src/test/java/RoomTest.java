import character.warriors.Barbarian;
import components.armours.Armour;
import components.armours.ArmourType;
import components.enemies.Enemy;
import components.enemies.EnemyType;
import components.weapons.Weapon;
import components.weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Weapon weapon;
    Weapon weapon2;
    Armour armour;
    Barbarian barbarian;
    Enemy enemy;


    @Before
    public void setUp() {
        weapon = new Weapon("Smasher", WeaponType.AXE);
        weapon2 = new Weapon("Whatever", WeaponType.CLUB);
        armour = new Armour("Scracher", ArmourType.CHAINMAIL);
        barbarian = new Barbarian("Attilia", armour, weapon);
        enemy = new Enemy(EnemyType.BASILISK, 100, weapon2);
        room = new Room();
    }

//    @Test
//    public void canFightTurn() {
//        room.addEnemy(enemy);
//        room.addCharacter(barbarian);
//        room.fightTurn(barbarian,enemy);
//        assertEquals(97, enemy.getHp());
//        assertEquals(715,barbarian.getHP());
//    }
}
