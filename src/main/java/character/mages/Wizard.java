package character.mages;

import components.creatures.Creature;
import components.spells.Spell;

public class Wizard extends Mage{

    public Wizard(String name, int hp, Spell spell, Creature creature) {
        super(name, hp, spell, creature);
    }
}
