public interface Builder {
    //all attributes used by an object
    void setCharacterClass(CharacterClasses characterClass);
    void setWeapon(Weapon weapon);
    void setIntelligence(int intelligence);
    void setFaith(int faith);
    void setStrength(int strength);
    void setDexterity(int dexterity);
    void setHp(int hp);
    void setMp(int mp);
    void setUltimate(Ultimate ultimate);
    void setSkill1(Skill skill1);
    void setSkill2(Skill skill2);
}
