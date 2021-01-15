package character.mages;

import character.Player;
import components.spells.Spell;
import components.spells.OffensiveSpell;

public abstract class Mage extends Player {

    public Mage(String name, int attack, int hp){
        super(name, attack, hp);

    }

//    public int getSpell() {
//        return offensiveSpell.getSpellEffect();
//    }

//    public Creature getCreature() {
//        return creature;
//    }
}
