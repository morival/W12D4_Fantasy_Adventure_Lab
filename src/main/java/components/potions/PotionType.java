package components.potions;

public enum PotionType {
    
    POWER_POTION(2),
    ILLUSION_POTION(3),
    STEALTH_POTION(2);
    
    private final int potionValue;
    
    PotionType(int potionValue) {this.potionValue = potionValue;}

    public int getPotionValue() {return potionValue;}
    
}
