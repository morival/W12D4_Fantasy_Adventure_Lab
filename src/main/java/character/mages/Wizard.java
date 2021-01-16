package character.mages;

import components.spells.OffensiveSpell;
import interfaces.IFight;

public class Wizard extends Mage implements IFight {

    OffensiveSpell offensiveSpell;

    public Wizard(String name, OffensiveSpell offensiveSpell) {
        super(name, 24, 450);
        this.offensiveSpell = offensiveSpell;
    }

    public String getSpellName() {
        return offensiveSpell.getName();
    }

    public int getSpell() {
        return offensiveSpell.getSpellEffect();
    }

    public int getTotalDamage() {
        return getSpell();
    }
}
