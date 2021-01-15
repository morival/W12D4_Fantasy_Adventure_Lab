package components.spells;

public class SummoningSpell extends Spell{

    private Summon summon;

    public SummoningSpell(String name, Summon summon) {
        super(name, SpellType.SUMMONING);
        this.summon = summon;
    }

    public Summon getSummonType() {
        return summon;
    }

//    public int getSpellEffect() {
//        return summon.getSpellDamage();
//    }
}