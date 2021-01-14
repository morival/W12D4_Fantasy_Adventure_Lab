package components.spells;

import components.Item;

public class Spell extends Item {

    private SpellType spellType;

    public Spell(String name, SpellType spellType){
        super(name);
        this.spellType = spellType;
    }

    public int getDamageValue() {return this.spellType.getDamageValue();}

    public SpellType getType() {return spellType;}
}
