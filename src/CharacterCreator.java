public class CharacterCreator {
    //Director class. You can put some common configurations of your object here
    //to reuse them
    public void createAssassin(Builder builder){
        builder.setCharacterClass(CharacterClasses.ASSASSIN);
        builder.setWeapon(new Weapon(110, 15,  20, 0, 0,
                "Dagger", "Dull Dagger"));
        builder.setIntelligence(9);
        builder.setFaith(4);
        builder.setStrength(23);
        builder.setDexterity(29);
        builder.setHp(230);
        builder.setMp(150);
        builder.setUltimate(new Ultimate(100, 2000, "Physical", "Bladestorm"));
        builder.setSkill1(new Skill(35, 500, "Physical", 3, "Backstab"));
        builder.setSkill2(new Skill(20, 200, "Physical", 2, "Shuriken"));
    }

    public void createMage(Builder builder){
        builder.setCharacterClass(CharacterClasses.MAGE);
        builder.setWeapon(new Weapon(200, 3,  0, 30, 13,
                "Staff", "Sorcerer's Staff"));
        builder.setIntelligence(38);
        builder.setFaith(23);
        builder.setStrength(10);
        builder.setDexterity(7);
        builder.setHp(170);
        builder.setMp(220);
        builder.setUltimate(new Ultimate(150, 4000, "Magical", "Comet Azur"));
        builder.setSkill1(new Skill(35, 400, "Fire", 5, "Fireball"));
        builder.setSkill2(new Skill(35, 400, "Ice", 5, "Icy Lance"));
    }

    public void createPriest(Builder builder){
        builder.setCharacterClass(CharacterClasses.PRIEST);
        builder.setWeapon(new Weapon(100, 3,  0, 23, 38,
                "Grimoire", "Blessed Book of Incantations"));
        builder.setIntelligence(28);
        builder.setFaith(39);
        builder.setStrength(9);
        builder.setDexterity(5);
        builder.setHp(190);
        builder.setMp(220);
        builder.setUltimate(new Ultimate(200, 300, "heal", "Blessing"));
        builder.setSkill1(new Skill(45, 120, "heal", 5, "Invigorate"));
        builder.setSkill2(new Skill(20, 200, "Holy", 3, "Turn Undead"));
    }
}
