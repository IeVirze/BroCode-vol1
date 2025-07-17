import java.util.Random;
import java.util.Scanner;

public class numGuessingGame {
    public static void  main(String[] args) {

        //Number guessing game

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        //Define variables
        int guess;
        int attempts = 0;
        int num = random.nextInt(1, 101);

        System.out.println("Welcome to number guessing game!");
        System.out.println("Guess the number between 1 and 100");

        do{
            System.out.print("Enter your guess!");
            guess = scanner.nextInt();
            attempts ++;

            if(guess < num) {
                System.out.println("You have guessed too low.");
            } else if (guess > num){
                System.out.println("You have guessed too high!");}
            else {
                System.out.println("You guessed the number! It indeed was: " + num);
                System.out.println("It took you " + attempts + " attempts to guess");}

        }while (guess != num);
        scanner.close();
    }
}
