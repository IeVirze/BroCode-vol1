import java.util.Random;
import java.util.Scanner;

public class bankingProgramSimple {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // JAVA Bankting program for beginners

        //declare variables
        int option;
        double balance;
        boolean isNext = true;

        Random random = new Random(); //create random amount in the bank account

        balance = random.nextInt(1, 1000000);

        System.out.println("Welcome to WestBank account!");

        while (isNext){
            System.out.println("You can perform the following operations: ");
            System.out.println("1. Show your account balance \n" +
                    "2. Make a deposit \n" +
                    "3. Withdraw funds from your account");
            System.out.print("Please enter a number of option you want to perform: ");
            option  = scanner.nextInt();

            switch (option){
                case 1 -> showBalance(balance);
                case 2 -> balance = deposit(balance);
                case 3 -> balance = withdraw(balance);
                default -> System.out.println("Please enter valid option number");
            }

            isNext = check();
            //System.out.println(isNext);
        }

        System.out.println("Thank you for choosing our bank!");


    }
    static void showBalance(double amount){

        System.out.printf("Your account balance is %.2f euro \n", amount);

    }
    static double deposit(double amount){
        double deposit;
        double add;

        System.out.println("How much do you want to deposit?");
        System.out.println("Please add amount: ");
        deposit = scanner.nextDouble();
        if (deposit > 0){
            add = deposit + amount;

            System.out.printf("You have deposited %.2f euros, now your new balance is %.2f", deposit, add);

            return add;}
        else {
            System.out.println("You have entered invalid amount");
            return amount;
        }

    }
    static double withdraw(double account){

        double reminder;
        double amount;

        System.out.println("How much do you want to withdraw?");
        System.out.println("Please eneter the amount: ");
        amount = scanner.nextDouble();

        if (amount > account) {
            System.out.println("You have insufficient funds");
            return account;
        } else if (amount > 0) {

            reminder = account - amount;
            System.out.printf("You have withdrawn %.2f amount, your reminding balance is: %.2f \n", account, reminder);
            ;
            return reminder;
        } else {
            System.out.println("You have entered invalid amount!");
            return account;}


    }
    static boolean check(){
        String inNext;
        boolean test;
        System.out.println("Do you want to continue with a different operation? (Yes/No)");
        inNext = scanner.next().toLowerCase();

        if (inNext.equals("yes")){
            test = true;
        } else test = false;

        return test;
    }
}
