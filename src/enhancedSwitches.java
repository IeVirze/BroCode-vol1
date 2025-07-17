import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args) {
        //Enhanced switches are for Java 14 and higher and would be preferable instead of regular switch
        //Enhanced switch = A replacement to may else if statements

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        //Check if the day is a weekday or weekend
        switch (day) {
            //case "Monday" -> System.out.println("It is a weekday");
            //the line reads: if day is "Monday" do this: print "It is a weekday"

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("it is a weekday");
            //consolidate the same behaviour by adding multiple clauses under the same case separated by comma
            case  "Saturday", "Sunday" -> System.out.println("It is a weekend");

            default -> System.out.println(day + " is not a day"); //similar behaviour to else statement

        }

    }
}
