package character.mages;

import components.creatures.Creature;
import components.spells.Spell;

public class Warlock extends Mage{

    public Warlock(String name, int hp, Spell spell, Creature creature) {
        super(name, hp, spell, creature);
    }
}
