import java.text.DecimalFormat;
import java.util.Scanner;
public class mathCalculations {
    public static void main(String[] args) {

        //Find Hypothenuse of a right angled triangle
        //formula c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        //Define variables
        double sideA;
        double sideB;
        double hyp;

        //decimal format definition for double
        DecimalFormat df = new DecimalFormat("####0.00");


        //Request user input for triangle side lenghts
        System.out.print("Enter the length of triangle's side A: ");
        sideA = scanner.nextDouble();
        System.out.print("Enter the length of triangle's side B: ");
        sideB = scanner.nextDouble();

        //calculate result and output it

        hyp = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        System.out.println("if the triangle's side A is " + sideA + " and side B is " + sideB + " then hypotenuse is " + df.format(hyp));

    }
}
