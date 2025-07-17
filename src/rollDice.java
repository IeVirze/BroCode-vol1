import java.util.Random;
import java.util.Scanner;

public class rollDice {
    //Add scanner to class variable to use in all class methods
    //Add static in front of Scanner as it is ued by static methods
    static Scanner scanner = new Scanner(System.in);

    public static void  main(String[] args){
        //Java dice roller program

        //Declare variables
        int dieCount; //plural of dice = die
        int guess;
        double money;
        double balance = 0;
        int roll;
        int total;
        boolean letsRoll = true;


        System.out.println("Welcome to the Dice Rolling Bet!");
        System.out.println("Let's challenge your luck!");
        System.out.println("-----");
        System.out.println("Rules \n" +
                "1. Choose how many dice will you roll?\n" +
                "2. Choose a sum of money you are betting\n" +
                "2. Make your guess on the total sum of the roll\n" +
                "3. Wait for the roll and see if you have made your money back!\n");
        System.out.println("----");

        while (letsRoll){
            //reassign total value of dice roll
            total = 0;

            System.out.println("Choose # of dice: ");
            dieCount = scanner.nextInt();
            System.out.println("Sum of money you are betting: ");
            money = scanner.nextDouble();
            System.out.println("What do you think the die will roll? Enter total of all dice: ");
            guess = scanner.nextInt();

            //Roll dice # of times according to user input
            for (int i = 1; i <= dieCount; i++ ){
                roll = rollGen();

                //System.out.printf("%d dice has rolled number %d \n", i, roll);
                drawDie(roll);
                //calculate total roll sum
                total += roll;
            };

            System.out.printf("Dice roll total is: %d \n \n", total);

            //check if money lost or won
            if (guess == total) {
                money = money*2;
                balance += money;
                System.out.printf(" You have doubled your money's worth!\n" +
                        "You have won: %.2f\n" +
                        "Your game total now is: %.2f\n", money, balance);
            } else {

                balance = balance - money;
                System.out.printf(" You have lost your bet!\n" +
                        "You have lost: %.2f\n" +
                        "Your game total now is: %.2f\n", money, balance);
            }

            //Check if user wants to continue
            letsRoll = letsRoll();

        }

        scanner.close();
    }

    private static void drawDie(int roll) {
        //does not return anything as it just draws the rolled die faces
        switch (roll) {
            case 1  -> System.out.println("""
                     ——————— 
                    |       |
                    |   ●   |
                    |       |
                     ——————— 
                    """);
            case 2 -> System.out.println("""
                     ——————— 
                    | ●     |
                    |       |
                    |     ● |
                     ———————                     
                   """);
            case 3 -> System.out.println("""
                     ——————— 
                    | ●     |
                    |   ●   |
                    |     ● |
                     ——————— 
                    """);

            case 4 -> System.out.println("""
                     ——————— 
                    | ●   ● |
                    |       |
                    | ●   ● |
                     ———————                     
                    """);

            case 5 -> System.out.println("""
                     ——————— 
                    | ●   ● |
                    |   ●   |
                    | ●   ● |
                     ——————— 
                    """);

            case 6 -> System.out.println("""
                     ——————— 
                    | ●   ● |
                    | ●   ● |
                    | ●   ● |
                     ——————— 
                    """);

            default -> System.out.println(" ");


        }

    }

    private static boolean letsRoll() {

        String answer;
        boolean choice = true;

        System.out.println("Do you want to try your luck again? (Yes/No)");
        answer = scanner.next().toLowerCase();

        if(answer.equals("yes")) {
            return true;
        } else {
            System.out.println("Thank you for playing!");
            return false;
        }

    }


    static int rollGen() {
        //method is called to generate 1 dice roll result
        int roll;
        Random random = new Random();
        roll = random.nextInt(1, 7);
        return roll;
    }
}
