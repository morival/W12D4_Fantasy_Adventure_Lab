package character.healers;

import components.potions.Potion;
import components.herbs.Herb;
import components.spells.Spell;

public class Cleric extends Healer {

    private Spell spell;

public Cleric(String name, int hp, Potion potion, Herb herb, Spell spell){
    super(name, 150, potion, herb);
    this.spell = spell;
    }

    public Spell getSpell(){
        return spell;
    }
}
