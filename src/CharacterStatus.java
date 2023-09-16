public class CharacterStatus {
    private final CharacterClasses characterClass;
    private final Weapon weapon;
    private final int intelligence;
    private final int faith;
    private final int strength;
    private final int dexterity;
    private final int HP;
    private int MP;
    private final Ultimate ultimate;
    private final Skill skill1;
    private final Skill skill2;
    private int currMP;

    public CharacterStatus(CharacterClasses characterClass, Weapon weapon, int intelligence,
                     int faith, int strength, int dexterity,
                     int HP, int MP, Ultimate ultimate, Skill skill1, Skill skill2) {
        this.characterClass = characterClass;
        this.weapon = weapon;
        this.intelligence = intelligence;
        this.faith = faith;
        this.strength = strength;
        this.dexterity = dexterity;
        this.HP = HP;
        this.MP = MP;
        this.ultimate = ultimate;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.currMP = MP;
    }

    public String print(){
        String status = "";
        status += "Character class: " + characterClass + "\n";
        status += "HP : " + HP + "\n";
        status += "MP : " + MP + "\n";
        status += "Weapon Stats: \n";
        status += weapon.getWeaponStats();
        status += "Int: " + intelligence + "\n";
        status += "Fai: " + faith + "\n";
        status += "Str: " + strength + "\n";
        status += "Dex: " + dexterity + "\n";
        status += "Ultimate: " + ultimate.getUltName() + "\n";
        status += "Primary Skill: " + skill1.getSkillName() + "\n";
        status += "Secondary Skill: " + skill2.getSkillName() + "\n";

        return status;
    }

    public void setMP(int cost) {
        this.MP -= cost;
    }

    public void attack(){
        weapon.attack();
    }

    public int castUlt(){
        if(currMP < ultimate.getMpCost()) {
            System.out.println("Insufficient MP");
            return 0;
        }
        ultimate.castUltimate();
        return ultimate.getMpCost();
    }

    public int castSkill1(){
        if(currMP < skill1.getMpCost()) {
            System.out.println("Insufficient MP");
            return 0;
        }
        skill1.castSkill();
        return skill1.getMpCost();
    }

    public int castSkill2(){
        if(currMP < skill2.getMpCost()) {
            System.out.println("Insufficient MP");
            return 0;
        }
        skill2.castSkill();
        return skill2.getMpCost();
    }
}
