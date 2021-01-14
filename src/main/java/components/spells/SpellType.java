package components.spells;

public enum SpellType {

    FIREBALL(5),
    LIGHTNING_STRIKE(6),
    FRENZY(3);

    private final int damageValue;

    SpellType(int damageValue){this.damageValue = damageValue;}

    public int getDamageValue(){return damageValue;}

}
