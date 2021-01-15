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
        enemy = new Enemy(EnemyType.BASILISK, 25, 100, weapon2);
        barbarian = new Barbarian("Attilia", armour, weapon);
    }

    @Test
    public void hasName() {
        assertEquals(EnemyType.BASILISK, enemy.getEnemyType());
    }

    @Test
    public void hasHP() {
        assertEquals(100, enemy.getHP());
    }

    @Test
    public void hasWeapon() {
        assertEquals(weapon2, enemy.getWeapon());
        assertEquals(WeaponType.CLUB, enemy.getWeaponType());
        assertEquals(1, enemy.getWeaponDamage());
    }

    @Test
    public void checkWeaponName() {
        assertEquals("Whatever", enemy.getWeapon().getWeaponName());
    }


    @Test
    public void checkTotalDamage() {
        assertEquals(26, enemy.getTotalDamage());
    }
//    @Test
//    public void canAttackPlayer() {
//        assertEquals(725, barbarian.getHP());
//        enemy.fight(barbarian);
//        assertEquals(699,barbarian.getHP());
//    }
}
