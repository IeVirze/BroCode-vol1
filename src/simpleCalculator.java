import java.util.Scanner;

public class simpleCalculator {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Define variables
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOp = true; //checks if the requested operation is possible with current calculator

        System.out.print("Enter a number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0); //converts to be a characte instead of the String

        System.out.print("Enter a number: ");
        num2 = scanner.nextDouble();
        //enhancd switch, to save number in the variable define the base output like 0 in variables
        switch (operator) {
            case '+' -> result = num1 + num2; //single quotes because it is a character not string
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("Cannot divide by zero.");
                    validOp = false;
                }else{result = num1 / num2;};
            }
            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.println("You have not entered simple equation.");
                validOp = false;
            }
        }

        if(validOp){
        System.out.printf("Result is %.2f", result);}



        scanner.close();
    }
}
