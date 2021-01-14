import character.warriors.Barbarian;
import components.armours.Armour;
import components.armours.ArmourType;
import components.enemies.Enemy;
import components.enemies.EnemyType;
import components.weapons.Weapon;
import components.weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

public class EnemyTest {

    Weapon weapon;
    Armour armour;
    Enemy enemy;
    Barbarian barbarian;

    @Before
    public void setUp() {
        weapon = new Weapon("Smasher", WeaponType.AXE);
        armour = new Armour("Scracher", ArmourType.CHAINMAIL);
        enemy = new Enemy(EnemyType.BASILISK, 100, 10);
        barbarian = new Barbarian("Attilia", 200, armour, weapon);
    }

//    @Test
//    public
}
