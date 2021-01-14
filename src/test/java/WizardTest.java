import character.mages.Wizard;
import components.creatures.CreatureType;
import components.spells.Spell;
import components.creatures.Creature;
import components.spells.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell spell;
    Creature creature;


    @Before
    public void setUp(){
        spell = new Spell("Fireball", SpellType.FIREBALL);
        creature = new Creature("Dragon", CreatureType.SMAUG);
        wizard = new Wizard("Gandalf", 150, spell, creature);
    }

    @Test
    public void hasName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(150, wizard.getHP());
    }

    @Test
    public void hasSpell() {
        assertEquals(spell, wizard.getSpell());
    }

    @Test
    public void hasCreature() {
        assertEquals(creature, wizard.getCreature());
    }
}
