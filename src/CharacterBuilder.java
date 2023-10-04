public class CharacterBuilder implements Builder{
    //example of a builder class

    //declare object attributes
    private CharacterClasses characterClass;
    private Weapon weapon;
    private int intelligence;
    private int faith;
    private int strength;
    private int dexterity;
    private int hp, mp;
    private Ultimate ultimate;
    private Skill skill1;
    private Skill skill2;
    @Override
    public void setCharacterClass(CharacterClasses characterClass) {this.characterClass = characterClass;}

    @Override
    public void setWeapon(Weapon weapon) {this.weapon = weapon;}

    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void setFaith(int faith) {
        this.faith = faith;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void setMp(int mp) {
        this.mp = mp;
    }

    @Override
    public void setUltimate(Ultimate ultimate) {
        this.ultimate = ultimate;
    }

    @Override
    public void setSkill1(Skill skill1) {
        this.skill1 = skill1;
    }

    @Override
    public void setSkill2(Skill skill2) {
        this.skill2 = skill2;
    }

    public Character getResult(){
        return new Character(characterClass, weapon, intelligence, faith, strength, dexterity, hp, mp,
                ultimate, skill1, skill2);
    }
}
