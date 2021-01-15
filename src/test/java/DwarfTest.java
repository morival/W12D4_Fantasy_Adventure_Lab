import character.warriors.Dwarf;
import components.armours.Armour;
import components.armours.ArmourType;
import components.weapons.Weapon;
import components.weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Armour armour;
    Weapon weapon;


    @Before
    public void setUp() {
        dwarf = new Dwarf("Thorin", armour, weapon);
        weapon = new Weapon("War Hammer", WeaponType.WARHAMMER);
        armour = new Armour("Norgothrond", ArmourType.DAEDRIC);
    }

    @Test
    public void canGetName() {
        assertEquals("Thorin", dwarf.getName());
    }
}
