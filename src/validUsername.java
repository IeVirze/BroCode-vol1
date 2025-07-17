import java.util.Scanner;

public class validUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.println("Enter your user name 4-12 characters long.");
        username = scanner.nextLine();

        if ((username.length() >= 4 || username.length() <= 12) && !username.contains(" ") && !username.contains("_")) {
            System.out.println("Username is valid");

        } else {
            System.out.println("Please input valid username");}


        scanner.close();
    }
}
