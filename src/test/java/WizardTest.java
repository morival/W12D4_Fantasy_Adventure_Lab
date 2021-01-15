import character.mages.Wizard;
import components.spells.OffensiveSpell;
import components.spells.SpellDamage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    OffensiveSpell offensiveSpell;


    @Before
    public void setUp(){
        offensiveSpell = new OffensiveSpell("Fireball", SpellDamage.FIREBALL);
        wizard = new Wizard("Gandalf", offensiveSpell);
    }

    @Test
    public void hasName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(450, wizard.getHP());
    }

    @Test
    public void canPickSpell() {
        assertEquals("Fireball", wizard.getSpellName());
        assertEquals(50, wizard.getSpell());
    }

//    @Test
//    public void hasCreature() {
//        assertEquals(creature, wizard.getCreature());
//    }
}
