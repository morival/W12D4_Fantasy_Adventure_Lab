package components.enemies;

public class Enemy {

    private EnemyType enemyType;
    public int hp;
    private int damage;

    public Enemy(EnemyType enemyType, int hp, int damage){
        this.enemyType = enemyType;
        this.hp = hp;
        this.damage = damage;
    }


    public EnemyType getEnemyType() {
        return enemyType;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }
}
