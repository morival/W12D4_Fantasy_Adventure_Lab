import character.healers.Cleric;
import components.herbs.Herb;
import components.herbs.HerbType;
import components.potions.Potion;
import components.potions.PotionType;
import components.spells.Spell;
import components.spells.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion;
    Herb herb;
    Spell spell;


    @Before
    public void setUp() {
        potion = new Potion("Damage Potion", PotionType.POWER_POTION);
        herb = new Herb("Death_bell", HerbType.DEATHBELL);
        spell = new Spell("Fireball", SpellType.FIREBALL);
        cleric = new Cleric("Zsolt", 150, potion, herb, spell);
    }

    @Test
    public void hasName() {
        assertEquals("Zsolt", cleric.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(150, cleric.getHP());
    }

    @Test
    public void hasPotion() {
        assertEquals(potion, cleric.getPotion());
    }

    @Test
    public void hasHerb() {
        assertEquals(herb, cleric.getHerb());
    }

    @Test
    public void hasSpell() {
        assertEquals(spell, cleric.getSpell());
    }
}
