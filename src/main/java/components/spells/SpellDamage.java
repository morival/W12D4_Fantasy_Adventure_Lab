package components.spells;

public enum SpellDamage {

    LIGHTNING(75),
    FIREBALL(50),
    BLIZZARD(25);

    private final int damage;

    SpellDamage(int damage) {
        this.damage = damage;
    }

    public int getSpellDamage() {
        return damage;
    }
}
