public class Character {
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

    public Character(CharacterClasses characterClass, Weapon weapon, int intelligence,
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

    public CharacterClasses getCharacterClass() {
        return characterClass;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getFaith() {
        return faith;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public Ultimate getUltimate() {
        return ultimate;
    }

    public Skill getSkill1() {
        return skill1;
    }

    public Skill getSkill2() {
        return skill2;
    }

    public int getCurrMP() {
        return currMP;
    }

    public void setMP(int cost) {
        this.MP -= cost;
    }
}
