import character.healers.Druid;
import components.herbs.Herb;
import components.potions.Potion;
import org.junit.Before;

public class DruidTest {

    Druid druid;
    Potion potion;
    Herb herb;

    @Before
    public void setUp() {
        druid = new Druid("Fenric", 150, potion, herb);
    }
}
