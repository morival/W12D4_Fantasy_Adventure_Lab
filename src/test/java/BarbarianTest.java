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
    Weapon weapon2;
    Enemy enemy;


    @Before
    public void setUp() {
        weapon = new Weapon("Smasher", WeaponType.AXE);
        weapon2 = new Weapon("Whatever", WeaponType.CLUB);
        armour = new Armour("Scracher", ArmourType.CHAINMAIL);
        barbarian = new Barbarian("Attilia", armour, weapon);
        enemy = new Enemy(EnemyType.BASILISK, 25, 100, weapon2);
    }

    @Test
    public void hasName() {
        assertEquals("Attilia", barbarian.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(725, barbarian.getHP());
    }

    @Test
    public void hasArmour() {
        assertEquals(armour, barbarian.getArmour());
        assertEquals(ArmourType.CHAINMAIL, barbarian.getArmourType());
        assertEquals(20, barbarian.getArmourStrength());
    }

    @Test
    public void checkArmourName() {
        assertEquals("Scracher", barbarian.getArmour().getArmourName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(weapon, barbarian.getWeapon());
        assertEquals(WeaponType.AXE, barbarian.getWeaponType());
        assertEquals(3, barbarian.getWeaponDamage());
    }

    @Test
    public void checkWeaponName() {
        assertEquals("Smasher", barbarian.getWeapon().getWeaponName());
    }

    @Test
    public void checkTotalDamage() {
        assertEquals(35, barbarian.getTotalDamage());
    }
}
