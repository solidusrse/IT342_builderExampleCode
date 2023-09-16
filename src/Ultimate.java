public class Ultimate {
    private final int mpCost;
    private int damage;
    private String damageType;
    private String ultName;

    public Ultimate(int mpCost, int damage, String damageType, String ultName) {
        this.mpCost = mpCost;
        this.damage = damage;
        this.damageType = damageType;
        this.ultName = ultName;
    }

    public void castUltimate(){
        if(damageType == "heal"){
            System.out.println("\nCasted ultimate for " + getMpCost() + " MP healing " + getDamage() + " HP to self and party members!\n");
            return;
        }
        System.out.println("\nCasted ultimate for " + getMpCost() + " MP dealing " + getDamage() + " " + getDamageType() + " damage!\n");
    }

    public int getMpCost() {
        return mpCost;
    }

    public int getDamage() {
        return damage;
    }

    public String getDamageType() {
        return damageType;
    }

    public String getUltName() {
        return ultName;
    }
}
