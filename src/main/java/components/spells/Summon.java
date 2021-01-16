package components.spells;

public enum Summon {

    DRAGON(65, 1200),
    OGRE(35, 800),
    BASILISK(25, 450);

    private final int attack;
    private final int hp;

    Summon(int attack, int hp) {
        this.attack = attack;
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }
    public int getHp() {
        return hp;
    }

}
