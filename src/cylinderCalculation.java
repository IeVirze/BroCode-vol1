import java.text.DecimalFormat;
import java.util.Scanner;

public class cylinderCalculation {
    public static  void main(String[] args){
        //circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        //Cylinder charasteristic sizes

        Scanner scanner = new Scanner(System.in);

        //Declare variables
        double circumf; //circumf as in circumference
        double area;
        double volume;
        double pi = Math.PI;
        double radius;
        double h;

        //decimal format definition for double
        DecimalFormat df = new DecimalFormat("####0.00");

        //Create input questions
        System.out.println("What is the radius of a circle?");
        radius = scanner.nextDouble();
        System.out.println("What is the height of the cylinder?");
        h = scanner.nextDouble();

        //Calculate and output result
        circumf = 2 * pi * radius;
        area = pi * Math.pow(radius, 2);
        volume = pi * Math.pow(radius, 2) * h;

        System.out.println("The cylinder's circumference is " + df.format(circumf) + " the area is " + df.format(area) + " and the volume is " + df.format(volume));
    }
}
