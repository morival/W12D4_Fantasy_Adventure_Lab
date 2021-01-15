package components.enemies;

import components.weapons.Weapon;
import components.weapons.WeaponType;
import interfaces.IFight;

public class Enemy implements IFight{

    private EnemyType enemyType;
    private int attack;
    private int hp;
    private Weapon weapon;

    public Enemy(EnemyType enemyType, int attack, int hp, Weapon weapon){
        this.enemyType = enemyType;
        this.attack = attack;
        this.hp = hp;
        this.weapon = weapon;
    }


    public EnemyType getEnemyType() {
        return enemyType;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return hp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public WeaponType getWeaponType(){
        return this.weapon.getType();
    }

    public int getWeaponDamage(){
        return this.weapon.getDamageValue();
    }

    public int getTotalDamage() {
        int totalDamage = getAttack() + getWeaponDamage();
        return totalDamage;
    }


    public void reduceHP(int damage) {
        this.hp -= damage;
    }

//    public int fight(int totalDamage) {
//        player.reduceHP(getTotalDamage());
//    }

}
