package character;

import components.Item;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int hp;
    ArrayList<Item> inventory;

    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
        this.inventory = new ArrayList<Item>();
    }

    public String getName() {
        return name;
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
}
