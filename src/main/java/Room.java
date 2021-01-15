import character.Player;
import components.enemies.Enemy;
import components.treasures.Treasure;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Player> characters;
    private ArrayList<Treasure> treasures;

    public Room(){
        this.enemies = new ArrayList<>();
        this.characters = new ArrayList<>();
        this.treasures = new ArrayList<>();
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<Player> getCharacters() {
        return characters;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void addCharacter(Player player) {
        characters.add(player);
    }

    public void addTreasure(Treasure treasure) {
        treasures.add(treasure);
    }

//    public void fightTurn(Player player, Enemy enemy){
//        enemy.fightPlayer(player);
//        player.fightEnemy(enemy);
//    }
}
