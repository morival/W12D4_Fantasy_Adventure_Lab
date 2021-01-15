import character.warriors.Knight;
import components.armours.Armour;
import components.armours.ArmourType;
import components.weapons.Weapon;
import components.weapons.WeaponType;
import org.junit.Before;

public class KnightTest {

    Knight knight;
    Armour armour;
    Weapon weapon;


    @Before
    public void setUp() {
        knight = new Knight("Sir Lancelot", armour, weapon);
        weapon = new Weapon("Excalibur", WeaponType.SWORD);
        armour = new Armour("Metal Shirt", ArmourType.STEEL);
    }
}
