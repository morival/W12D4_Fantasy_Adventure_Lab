import character.mages.Warlock;
import components.creatures.Creature;
import components.creatures.CreatureType;
import components.spells.Spell;
import components.spells.Summon;
import components.spells.SummoningSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    SummoningSpell summoningSpell;
    Creature creature;


    @Before
    public void setUp(){
        creature = new Creature("Dragon", CreatureType.SMAUG);
        summoningSpell = new SummoningSpell("Summon Ogre", Summon.OGRE);
        warlock = new Warlock("Brutus", summoningSpell);
    }

    @Test
    public void hasName() {
        assertEquals("Brutus", warlock.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(475, warlock.getHP());
    }

    @Test
    public void canPickSpell() {
        assertEquals("Summon Ogre", warlock.getSpellName());
        assertEquals(Summon.OGRE, warlock.getSpell());
    }
}
