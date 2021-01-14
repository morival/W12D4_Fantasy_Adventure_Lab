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

public class BarbarianTest {

    Barbarian barbarian;
    Armour armour;
    Weapon weapon;
    Enemy enemy;


    @Before
    public void setUp() {
        weapon = new Weapon("Smasher", WeaponType.AXE);
        armour = new Armour("Scracher", ArmourType.CHAINMAIL);
        barbarian = new Barbarian("Attilia", 200, armour, weapon);
        enemy = new Enemy(EnemyType.BASILISK, 100, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Attilia", barbarian.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(200, barbarian.getHP());
    }

    @Test
    public void hasArmour() {
        assertEquals(armour, barbarian.getArmour());
    }

    @Test
    public void checkArmourName() {
        assertEquals("Scracher", barbarian.getArmour().getArmourName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void checkWeaponName() {
        assertEquals("Smasher", barbarian.getWeapon().getWeaponName());
    }

    @Test
    public void canFightEnemy() {
        assertEquals(100, enemy.getHp());
        barbarian.fightEnemy(enemy);
        assertEquals(97, enemy.getHp());
    }
}
