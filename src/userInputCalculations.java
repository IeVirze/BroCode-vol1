import java.util.Scanner;

public class userInputCalculations {
    public static void main(String[] args) {

        //Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + " cm²"); //for superscript 2 click left alt and 0178 on numlock

        scanner.close();

    }
}
