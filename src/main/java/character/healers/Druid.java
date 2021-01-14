package character.healers;

import components.herbs.Herb;
import components.potions.Potion;

public class Druid extends Healer {

    public Druid(String name, int hp, Potion potion, Herb herb) {
        super(name, 150, potion, herb);
    }

//    public Herb craftNewHerb(String name, String type, int healingEffect){
//        Herb herb = new Herb(name, type, healingEffect);
//        this.inventory.add(herb);
//    }
}
