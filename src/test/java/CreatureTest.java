import components.creatures.Creature;
import components.creatures.CreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Creature creature;

    @Before
    public void setUp() {
        creature = new Creature("Smaug", CreatureType.DRAGON);
    }

    @Test
    public void hasName() {
        assertEquals("Smaug", creature.getName());
    }

    @Test
    public void hasAttack() {
        assertEquals(65, creature.getDamageValue());
    }

    @Test
    public void hasHP() {
        assertEquals(1200, creature.getHP());
    }
}
