package character.mages;

import components.creatures.Creature;
import components.spells.Spell;
import components.spells.Summon;
import components.spells.SummoningSpell;

public class Warlock extends Mage{

    SummoningSpell summoningSpell;

    public Warlock(String name, SummoningSpell summoningSpell) {
        super(name, 24, 475);
        this.summoningSpell = summoningSpell;
    }

    public String getSpellName() {
        return summoningSpell.getName();
    }

    public Summon getSpell() {
        return summoningSpell.getSummonType();
    }
}
