package components.enemies;

import character.Player;
import components.weapons.Weapon;
import interfaces.IFight;

public class Enemy implements IFight {

    private EnemyType enemyType;
    public int hp;
    private Weapon weapon;

    public Enemy(EnemyType enemyType, int hp, Weapon weapon){
        this.enemyType = enemyType;
        this.hp = hp;
        this.weapon = weapon;
    }


    public EnemyType getEnemyType() {
        return enemyType;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return weapon.getDamageValue();
    }


    public void reduceHP(int damage) {
        this.hp -= damage;
    }

    public void fight(Player player) {
        player.reduceHP(getDamage());
    }

    public void fightPlayer(Player player){
        player.reduceHP(getDamage());
    }
}
