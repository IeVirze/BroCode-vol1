import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        //method = a block of reusable code that is executed when called ()

        //declare variable
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please eneter your name: ");
        name = scanner.nextLine();

        System.out.println("Please eneter your age: ");
        age = scanner.nextInt();
        for( int i = 0; i < 3; i++) {
            happyBirthday(name, age); //when calling a method from static method the called method should be static as well
        }

        double result = square(3); //if there is no variable to which the returned result is assigned to it just "hangs in the air" and does nothing
        System.out.println(result);

    }

    static void happyBirthday(String name, int age) {
        //to pass variables from other method, you pass arguments to the method, but in order to pass arguments need to set up parameters
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s ! \n", name);
        System.out.printf("Happy Birthday you are %d age old!\n", age);
        System.out.println();

        //methods are unfamiliar with any variable declared in any other method
    }
    static double square(double number) {
        //this method will excecute an acion and return an answer
        return number * number;
    }
}
