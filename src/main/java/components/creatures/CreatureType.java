package components.creatures;

public enum CreatureType {

    DRAGON(65, 1200),
    OGRE(35, 800),
    BASILISK(25, 450);

    private final int attack;
    private final int hp;

    CreatureType(int attack, int hp) {
        this.attack = attack;
        this.hp = hp;
    }

    public int getDamageValue() {
        return attack;
    }
    public int getHp() {
        return hp;
    }
}
