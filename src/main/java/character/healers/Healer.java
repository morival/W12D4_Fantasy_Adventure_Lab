package character.healers;

import character.Player;
import components.herbs.Herb;
import components.potions.Potion;

public abstract class Healer extends Player {

    private Potion potion;
    private Herb herb;

    public Healer(String name, int attack, int hp, Potion potion, Herb herb) {
        super(name, attack, hp);
        this.potion = potion;
        this.herb = herb;
    }

    public Potion getPotion() {
        return potion;
    }

    public Herb getHerb() {
        return herb;
    }
}
