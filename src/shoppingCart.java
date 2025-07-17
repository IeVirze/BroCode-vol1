import java.text.DecimalFormat;
import java.util.Scanner; // import scanner to accept user input

public class shoppingCart {
    public static void main(String[] args){

        //Shopping Cart Program

        /* Directions:
        Create a simple program that accepts user input for the following:
        what user buy
        what is price for each item
        how many items buy

        then show how many items has been bought
        Display total
         */

        //Define Scanner; open scanner
        Scanner scanner = new Scanner(System.in);

        // Define variables for user input
        String product;
        double price;
        int quantity;
        double total; //double because price should have a decimal number

        System.out.print(" What item would you like to purchase? ");
        product = scanner.nextLine();
        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();
        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();


        //Output calculations
        total = quantity * price;

        DecimalFormat df = new DecimalFormat("####0.00"); //creates decimal format that can round numbers to 2 point

        System.out.println("You have bought " + quantity + product + "/s");
        System.out.println("Your total " + df.format(total) + " €");

        scanner.close();


    }
}
