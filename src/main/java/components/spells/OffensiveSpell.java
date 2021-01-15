package components.spells;

public class OffensiveSpell extends Spell{

    private SpellDamage spellDamage;

    public OffensiveSpell(String name, SpellDamage spellDamage) {
        super(name, SpellType.OFFENSIVE);
        this.spellDamage = spellDamage;
    }

    public int getSpellEffect() {
        return spellDamage.getSpellDamage();
    }
}
