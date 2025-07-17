import java.util.Scanner;
public class compoudIntCalculator {
    public static void main(String[] args) {
        //Compund interest formula:
        // A = P * Math.pow(1 + r / n, n * t)

        //Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal; //principal amount as in what bank loned or you put in savings
        double rate; // % rate
        int comp; //times compound
        int years;
        double total;
        char currency = '€';

        //Ask for input about savings/loan
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble();
        System.out.print("Enter the # of times compounded per year: ");
        comp = scanner.nextInt();
        System.out.print("Enter the  # of years: ");
        years = scanner.nextInt();

        //Calculate compound interest
        total = principal * Math.pow(1 + (rate/100) / comp, years * comp);
        //Calculated output answer (should be formated)
        System.out.printf("The amount after %d years is %.2f %c.", years, total, currency);

    }
}
