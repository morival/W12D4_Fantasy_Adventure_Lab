import character.mages.Wizard;
import character.warriors.Barbarian;
import components.armours.Armour;
import components.armours.ArmourType;
import components.enemies.Enemy;
import components.enemies.EnemyType;
import components.spells.OffensiveSpell;
import components.spells.SpellDamage;
import components.treasures.Treasure;
import components.treasures.TreasureType;
import components.weapons.Weapon;
import components.weapons.WeaponType;
import interfaces.IFight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Weapon weapon;
    Weapon weapon2;
    Weapon weapon3;
    Armour armour;
    OffensiveSpell offensiveSpell;
    Barbarian barbarian;
    Wizard wizard;
    Enemy enemy;
    Treasure treasure;
    Room room;


    @Before
    public void setUp() {
        weapon = new Weapon("Smasher", WeaponType.AXE);
        weapon2 = new Weapon("Whatever", WeaponType.CLUB);
        weapon3 = new Weapon("no weapon", WeaponType.NON);
        armour = new Armour("Scracher", ArmourType.CHAINMAIL);
        offensiveSpell = new OffensiveSpell("Fireball", SpellDamage.FIREBALL);
        barbarian = new Barbarian("Attilia", armour, weapon);
        wizard = new Wizard("Saruman", offensiveSpell);
        enemy = new Enemy(EnemyType.BASILISK, 25, 100, weapon3);
        treasure = new Treasure("Gold", TreasureType.GOLD100);
        room = new Room(barbarian, enemy);
    }

    @Test
    public void canAddEnemy() {
        room.addEnemy(enemy);
        assertEquals(1, room.enemiesCount());
        assertEquals(true, room.getEnemies().contains(enemy));
    }

    @Test
    public void canAddCharacter() {
        room.addCharacter(barbarian);
        assertEquals(1, room.charactersCount());
        assertEquals(true, room.getCharacters().contains(barbarian));
    }

    @Test
    public void canAddTreasure() {
        room.addTreasure(treasure);
        assertEquals(1, room.treasureCount());
        assertEquals(true, room.getTreasures().contains(treasure));
    }

    @Test
    public void showUnitsTotalDamage() {
        assertEquals(35, room.getUnit1Damage(barbarian));
        assertEquals(25, room.getUnit2Damage(enemy));
    }

    @Test
    public void canTakeDamage() {
//        room.addCharacter(barbarian);
//        room.addEnemy(enemy);
        room.fightTurn(barbarian, enemy);
        assertEquals(700, barbarian.getHP());
        assertEquals(65, enemy.getHP());
    }

    @Test
    public void canFightMeleeBattle() {
        assertEquals("Character won", room.fightBattle(barbarian, enemy));
        assertEquals(650, barbarian.getHP());
        assertEquals(-5, enemy.getHP());
    }

    @Test
    public void canFightMagicAttackBattle() {
        assertEquals("Character won", room.fightBattle(wizard, enemy));
        assertEquals(400, wizard.getHP());
        assertEquals(0, enemy.getHP());
    }

}
