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

public class EnemyTest {

    Weapon weapon;
    Weapon weapon2;
    Armour armour;
    Enemy enemy;
    Barbarian barbarian;

    @Before
    public void setUp() {
        weapon = new Weapon("Smasher", WeaponType.AXE);
        weapon2 = new Weapon("Whatever", WeaponType.CLUB);
        armour = new Armour("Scracher", ArmourType.CHAINMAIL);
        enemy = new Enemy(EnemyType.BASILISK, 100, weapon2);
        barbarian = new Barbarian("Attilia", armour, weapon);
    }

    @Test
    public void canAttackPlayer() {
        assertEquals(725, barbarian.getHP());
        enemy.fightPlayer(barbarian);
        assertEquals(724,barbarian.getHP());
    }
}
