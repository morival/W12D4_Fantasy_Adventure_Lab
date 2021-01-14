import character.mages.Warlock;
import components.creatures.Creature;
import components.spells.Spell;
import org.junit.Before;

public class WarlockTest {

    Warlock warlock;
    Spell spell;
    Creature creature;


    @Before
    public void setUp(){
        warlock = new Warlock("Brutus", 100, spell, creature);
    }
}
