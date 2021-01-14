package components.treasures;

public enum TreasureType {

    GOLD100(100),
    GOLD200(200),
    GOLD300(300),
    GOLD400(400),
    GOLD500(500);

    private final int gold;

    TreasureType(int gold) {
        this.gold = gold;
    }

    public int getTreasure() {
        return gold;
    }

}
