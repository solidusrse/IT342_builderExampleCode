public class Skill {
    private final int mpCost;
    private int damage;
    private String damageType;
    private int cooldown;
    private String skillName;

    public Skill(int mpCost, int damage, String damageType, int cooldown, String skillName) {
        this.mpCost = mpCost;
        this.damage = damage;
        this.damageType = damageType;
        this.cooldown = cooldown;
        this.skillName = skillName;
    }

    public void castSkill(){
        if(damageType == "heal") {
            System.out.println("\nCasted skill for " + getMpCost() + " MP healing " + getDamage() + " HP!\n");
            return;
        }
        System.out.println("\nCasted skill for " + getMpCost() + " MP dealing " + getDamage() + " " + getDamageType() + " damage!\n");
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

    public int getCooldown() {
        return cooldown;
    }

    public String getSkillName() {
        return skillName;
    }
}
