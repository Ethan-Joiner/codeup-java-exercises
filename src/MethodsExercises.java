import java.util.Scanner;
public class MethodsExercises {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        addition(1, 2);
        subtraction(3, 2);
        multiplication (1, 2);
        division(3, 2);
        mod(10, 2);
//        getInteger(1,10);
        adventureGame();
            boolean again;
        do {
            getFactorial();
            System.out.println("Would you like to continue? Enter yes or no");
            String cont = sc.nextLine();
            if (cont.equalsIgnoreCase("yes")) {
                again = true;
            } else {
                again = false;
            }
        } while (again);


    }
    public static void addition(int first, int second) {
        System.out.println(first + second);
    }
    public static void subtraction(int first, int second) {
        System.out.println(first - second);
    }
    public static void multiplication(int first, int second) {
        System.out.println(first * second);
    }
    public static void division(float first, float second) {
        System.out.println(first / second);
    }
    public static void mod(int first, int second) {
        System.out.println(first % second);
    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int numInput = 0;
        while (numInput < min || numInput > max) {
            System.out.println("Enter a number between one and ten.");
            numInput = sc.nextInt();
        }
        return numInput;
    }
    public static void getFactorial() {
        int userNumber = getInteger(1, 10);
        long factorial = 1;
        for (int i = 1; i <= userNumber; i++) {
            factorial *= i;
            if (i == userNumber) {
                System.out.println(userNumber + "! = " + factorial);
            }
        }
    }


    public static void adventureGame(){
        int mageHealth = (int) (Math.random() * 20) + 50;

        int mageAttack = (int) (Math.random() * 10) + 10;

        int fireball = (int) (Math.random() * 10) + 20;

        int mageMana = (int) (Math.random() * 30) + 20;

        int warriorHealth = (int) (Math.random() * 20) + 80;

        int warriorAttack = (int) (Math.random() * 10) + 20;

        int warriorDefense = (int) (Math.random() * 20) + 60;

        int goblinHealth = (int) (Math.random() * 20) + 80;

        int goblinAttack = (int) (Math.random() * 5) + 10;

        int goblinEnrageAttack = (int) (Math.random() * 15) + 20;

        int fighterClassNum = 0;
        String fighterClass;

        int health;
        int mana;
        int attack;
        int defense;
        int currentHealth = goblinHealth;


        System.out.println("Would you like to go on an adventure?");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine().toLowerCase();
        if (userInput.equals("y") || userInput.equals("yes")) {
            System.out.println("Let's begin");
            System.out.println("What is your name, traveler?");
            String userName = sc.nextLine().toLowerCase();
            System.out.println("Welcome " + userName);
            System.out.println("Choose your class: Press 1 for mage or 2 for warrior!");
            fighterClassNum = sc.nextInt();
        }
        if (fighterClassNum == 1) {
            fighterClass = "Mage";
            health = mageHealth;
            mana = mageMana;
            attack = mageAttack;
            defense = 0;
            System.out.println("You have chosen " + fighterClass + '.');
            System.out.println("Your stats are\nHealth: " + health + "\n" + "Mana: " + mana + "\n" + "Attack: " + attack + "\n" + "Defense: " + defense);
            System.out.println("Let us begin. You are traveling along a cobblestone road and you are approached by an ugly looking goblin. It snarls at you menacingly and draws it's weapon.");
            System.out.println("Would you like to fight the goblin or attempt to reason?");
            sc.nextLine();
            String answer = sc.nextLine();
            if (answer.trim().equalsIgnoreCase("reason")) {
                System.out.println("There is no reasoning with a beast like this");
                health -= goblinAttack;
                System.out.println("The goblin is angered at your disgusting human voice and lunges at you with its club, dealing " + goblinAttack + " damage. Your health is now " + (health + "!"));
//                sc.nextLine();
                answer = "fight";
            }
            while (answer.equalsIgnoreCase("fight")) {

                System.out.println("What now? Cast a fireball or attack with your staff?");
                String fightOption = sc.nextLine();
                if (fightOption.equalsIgnoreCase("attack")) {
                    currentHealth -= mageAttack;
                    System.out.println("You swing your staff with your pathetically weak arms, dealing " + attack + " damage! The goblin now has " + currentHealth + " health left.");
                    if (currentHealth > 0) {
                        health -= goblinAttack;
                        System.out.println("The fight isn't over yet. The goblin strikes you with its club dealing " + goblinAttack + " damage. Your remaining health is " + health + "!");
                        if (currentHealth <= goblinHealth / 2) {
                            goblinAttack = goblinEnrageAttack;
                            System.out.println("The goblin is furious at your attacks and goes into a rage, doubling his damage!");
                        }
                    }}
                if (fightOption.equalsIgnoreCase("fireball")) {
                    currentHealth -= fireball;
                    mageMana -= 15;
                    System.out.println("You cast your fireball spell, dealing " + fireball + " damage! The goblin now has " + currentHealth + " health left. Your remaining mana is " + mageMana + ".");
                    if (currentHealth > 0) {
                        health -= goblinAttack;
                        System.out.println("The fight isn't over yet. The goblin strikes you with its club dealing " + goblinAttack + " damage. Your remaining health is " + health + "!");
                        if (currentHealth <= goblinHealth / 2) {
                            goblinAttack = goblinEnrageAttack;
                            System.out.println("The goblin is furious at your attacks and goes into a rage, doubling his damage!");
                        }
                    }
                }
                if (currentHealth <= 0) {
                    System.out.println("The goblin has been slain! ");
                    answer = "";
                }
                if (health <= 0) {
                    System.out.println("You died.");
                    answer = "";
                }

            }
        }
        else if (fighterClassNum == 2) {
            fighterClass = "Warrior";
            health = warriorHealth;
            mana = 0;
            attack = warriorAttack;
            defense = warriorDefense;
            System.out.println("You have chosen " + fighterClass + '.');
            System.out.println("Your stats are\nHealth: " + health + "\n" + "Mana: " + mana + "\n" + "Attack: " + attack + "\n" + "Defense: " + defense);
            System.out.println("Let us begin. You are traveling along a cobblestone road and you are approached by an ugly looking goblin. It snarls at you menacingly and draws it's weapon.");
            System.out.println("Would you like to fight the goblin or attempt to reason?");
            sc.nextLine();
            String answer = sc.nextLine();
            System.out.println(health);
            if (answer.equalsIgnoreCase("reason")) {
                System.out.println("There is no reasoning with a beast like this");
                System.out.println("The goblin is angered at your disgusting human voice and lunges at you with its club, dealing " + goblinAttack + " damage. Your health is now " + (health - goblinAttack + "!"));
                sc.nextLine();
                answer = "fight";
            }
        }
//        }
//        if(fighterClassNum > 0){
//            fighterClass = "Warrior";
//            health = warriorHealth;
//            mana = 0;
//            attack = warriorAttack;
//            defense = warriorDefense;
//            System.out.println("Let us begin. You are traveling along a cobblestone road and you are approached by an ugly looking goblin. It snarls at you menacingly and draws it's weapon.");
//            System.out.println("Would you like to fight the goblin or attempt to reason?");
//            sc.nextLine();
//            String answer = sc.nextLine();
//            System.out.println(health);
//            if (answer.equalsIgnoreCase("reason")) {
//                System.out.println("There is no reasoning with a beast like this");
//                System.out.println("The goblin is angered at your disgusting human voice and lunges at you with its club, dealing " + goblinAttack + " damage. Your health is now " + (health - goblinAttack + "!"));
//                sc.nextLine();
//                answer = "fight";
//            }
//        }


    }

}

