import character.Player;
import components.enemies.Enemy;
import components.treasures.Treasure;
import interfaces.IFight;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Player> characters;
    private ArrayList<Treasure> treasures;

    private IFight unit1;
    private IFight unit2;

    public Room(IFight unit1, IFight unit2){
        this.enemies = new ArrayList<>();
        this.characters = new ArrayList<>();
        this.treasures = new ArrayList<>();
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public int enemiesCount() {
        return enemies.size();
    }

    public ArrayList<Player> getCharacters() {
        return characters;
    }

    public void addCharacter(Player player) {
        characters.add(player);
    }

    public int charactersCount() {
        return characters.size();
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void addTreasure(Treasure treasure) {
        treasures.add(treasure);
    }

    public int treasureCount() {
        return treasures.size();
    }

    public int getUnit1Damage(IFight unit1) {
        return unit1.getTotalDamage();
    }

    public int getUnit2Damage(IFight unit2) {
        return unit2.getTotalDamage();
    }

    public void fightTurn(IFight unit1, IFight unit2){
        unit1.reduceHP(getUnit2Damage(unit2));
        unit2.reduceHP(getUnit1Damage(unit1));
    }
}
