package character.healers;

import components.potions.Potion;
import components.herbs.Herb;
import components.spells.Spell;

public class Cleric extends Healer {

    private Spell spell;

public Cleric(String name, Potion potion, Herb herb){
    super(name, 24, 550, potion, herb);
//    this.spell = spell;
    }

//    public Spell getSpell(){
//        return spell;
//    }
}
