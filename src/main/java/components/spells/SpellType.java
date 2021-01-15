package components.spells;

public enum SpellType {

    OFFENSIVE("wizard"),
    SUMMONING("warlock"),
    SUPPORTIVE("cleric");

    private final String availableFor;

    SpellType(String availableFor){this.availableFor = availableFor;}

    public String getSpellType(){return availableFor;}

}
