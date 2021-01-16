package character.mages;

import components.spells.Summon;
import components.spells.SummoningSpell;
import interfaces.IFight;

public class Warlock extends Mage implements IFight {

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

    public int getSummonedCreatureAttack() {
        return summoningSpell.getSummonType().getAttack();
    }

    public int getSummonedCreatureHP() {
        return summoningSpell.getSummonType().getHp();
    }

    public int getTotalDamage() {
        return getSummonedCreatureAttack();
    }
}
