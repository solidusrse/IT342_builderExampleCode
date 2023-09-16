public class Weapon {
    private final int atk;
    private int strNeeded;
    private int dexNeeded;
    private int intNeeded;
    private int faiNeeded;
    private String weaponType;
    private String weaponName;

    public Weapon(int atk, int strNeeded, int dexNeeded, int intNeeded, int faiNeeded, String weaponType, String weaponName) {
        this.atk = atk;
        this.strNeeded = strNeeded;
        this.dexNeeded = dexNeeded;
        this.intNeeded = intNeeded;
        this.faiNeeded = faiNeeded;
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

    public void attack(){
        System.out.println("Attacked for " + atk + " damage.");
    }

    public int getAtk() {
        return atk;
    }

    public int getStrNeeded() {
        return strNeeded;
    }

    public int getDexNeeded() {
        return dexNeeded;
    }

    public int getIntNeeded() {
        return intNeeded;
    }

    public int getFaiNeeded() {
        return faiNeeded;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public String getWeaponStats(){
        String stats = "";
        stats += "\t" + weaponName + "\n";
        stats += "\t\tAtk bonus: " + getAtk() + "\n";
        stats += "\t\tWeapon type: " + getWeaponType() + "\n";
        stats += "\t\tStr needed to wield: " + getStrNeeded() + "\n";
        stats += "\t\tDex needed to wield: " + getDexNeeded() + "\n";
        stats += "\t\tInt needed to wield: " + getIntNeeded() + "\n";
        stats += "\t\tFai needed to wield: " + getFaiNeeded() + "\n";

        return stats;
    }
}
