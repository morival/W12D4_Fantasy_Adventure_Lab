package character.mages;

import character.Player;
import components.spells.Spell;
import components.creatures.Creature;

public abstract class Mage extends Player {

    private Spell spell;
    private Creature creature;

    public Mage(String name, int hp, Spell spell, Creature creature){
        super(name, hp);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell() {
        return spell;
    }

    public Creature getCreature() {
        return creature;
    }
}
