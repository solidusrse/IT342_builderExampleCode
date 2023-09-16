import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();
        CharacterBuilder builder = new CharacterBuilder();

        //this is just for the character to be able to act
        CharacterStatusBuilder statusBuilder = new CharacterStatusBuilder();

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the class of your starter character (Assassin/Mage/Priest)? ");
        String characterClass = sc.nextLine();

        switch (characterClass){
            case "assassin":
            case "Assassin":
                creator.createAssassin(builder);
                creator.createAssassin(statusBuilder);
                break;
            case "mage":
            case "Mage":
                creator.createMage(builder);
                creator.createMage(statusBuilder);
                break;
            case "priest":
            case "Priest":
                creator.createPriest(builder);
                creator.createPriest(statusBuilder);
                break;
            default:
                System.out.println("Invalid class");
        }

        Character character = builder.getResult();
        System.out.println("Your starter character is a/an " + character.getCharacterClass() + "\n");

        CharacterStatus status = statusBuilder.getResult();
        int action;
        int cost;
        do {
            System.out.println(status.print());
            System.out.println("Character actions: 1-Attack, 2-Cast Skill 1, 3-Cast Skill 2, 4-Cast Ultimate");
            action = sc.nextInt();

            switch (action){
                case 1:
                    status.attack();
                    break;
                case 2:
                    if(character.getSkill1().getMpCost() > character.getMP()){
                        System.out.println("\nInsufficient MP!\n");
                        break;
                    }
                    cost = status.castSkill1();
                    character.setMP(cost);
                    status.setMP(cost);
                    break;
                case 3:
                    if(character.getSkill2().getMpCost() > character.getMP()){
                        System.out.println("\nInsufficient MP!\n");
                        break;
                    }
                    cost = status.castSkill2();
                    character.setMP(cost);
                    status.setMP(cost);
                    break;
                case 4:
                    if(character.getUltimate().getMpCost() > character.getMP()){
                        System.out.println("\nInsufficient MP!\n");
                        break;
                    }
                    cost = status.castUlt();
                    character.setMP(cost);
                    status.setMP(cost);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nAction unavailable!\n");
            }
        }while (action != 0);
        System.out.println("Character sets out on a journey...");
    }
}