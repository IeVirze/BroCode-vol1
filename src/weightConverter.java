import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        //Weight conversion program - from kg to lbs and from lbs to kg

        Scanner scanner = new Scanner(System.in);

        //Define variables
        int opt; //option
        double weight;
        double newWeight;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lb to kg");
        System.out.println("2: Convert kg to lb");
        System.out.print("Choose an option: ");
        opt = scanner.nextInt();

        //According to option chosen present the person with the correct conversion method
        if(opt == 1){
            System.out.print("Enter the weight in lb: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45359237; //The 0.45359237 is how a 1lb is defined to match 1kg

            System.out.printf("The weight in kg is: %.2f", newWeight);
        } else if (opt == 2) {
            System.out.print("Enter the weight in kg: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462; //The 2.20462 is how a 1kg is defined to match 1lb

            System.out.printf("The weight in kg is: %.2f", newWeight);

        } else {
            System.out.println("The option you have chosen, does not exist.");
        }

        scanner.close();
    }
}
