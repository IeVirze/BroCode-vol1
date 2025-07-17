import java.util.Scanner; //class import

public class userInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: "); //to have input on the same line use only "print" not "println"
        String name = scanner.nextLine(); //only next does not read spaces (takes first word before space) nextLine takes all input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();// takes integer as input

        System.out.print("What is your gpa?");
        double gpa = scanner.nextDouble(); //to accept double use nextDouble method

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is " + gpa);
        //System.out.println("Student: " + isStudent); better use the boolean in if statement
        if (isStudent){
            System.out.println("You are enrolled as student in University XYZ");
        } else {
            System.out.println("Sorry you failed to be enrolled.");
        }

        scanner.close(); //always close scanner to avoid unintended consequences

        //common issue
        /* Accept int or double then accept string
        after inputing intiger the clicking of Enter does add invisible new line character "\n" trailing
        the number. The trailing new line character is picked up by the string's "new.Line" method and
        is taken as an input value instead of waiting for the user's input.

        Here's how to fix it:
        int age = scanner.nextInt();
        scanner.nextLine();

        String colour = scanner.nextLine();

        the scanner.nextLine();  is called but not assigned to anything this helps to "clear" the input by
        assigning the trailing \n to the new nextLine that is not assigned to anything.
         */

    }
}
