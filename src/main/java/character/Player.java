package character;

import components.Item;
import components.enemies.Enemy;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int attack;
    private int hp;
    ArrayList<Item> inventory;

    public Player(String name, int attack, int hp){
        this.name = name;
        this.attack = attack;
        this.hp = hp;
        this.inventory = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return hp;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void addToInventory(Item item){
        this.inventory.add(item);
    }



    public void reduceHP(int damage) {
        this.hp -= damage;
    }

//    public void fight(Enemy enemy) {
//        enemy.reduceHP(getTotalDamage());
//    }
}
