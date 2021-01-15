package components.spells;

import components.Item;
import components.spells.OffensiveSpell;

public abstract class Spell extends Item {

    private SpellType spellType;

    public Spell(String name, SpellType spellType){
        super(name);
        this.spellType = spellType;
    }

//    public int getDamageValue() {return this.spellType.getDamageValue();}

    public SpellType getSpellType() {return spellType;}

//    public int getDamageOfSpell() {
//        return
//    }
}
