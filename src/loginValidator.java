import java.util.Scanner;

public class loginValidator {
    public static void main(String[] args){
        //This code should ask for user's e-mail and password, validate the e-mail and password
        //and match the e--mail and password so it is possible to "login"

        Scanner scanner = new Scanner(System.in);

        //Define variables
        String email;
        String username;
        String pasw; //password
        String paswValid; //repeated password to validate they match

        //Ask for user interaction
        System.out.println("Hello there! You are about to register to our site 'GnomesforWifes' ");
        System.out.print("Please, enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@") && (email.indexOf("@") == email.lastIndexOf("@"))){
            System.out.println("You have entered a valid email!");
            username = email.substring(0, email.indexOf("@"));
            System.out.printf("Your gnome username is: %s", username);
            System.out.println("Please write your password. It should meet the following criteria: ");
            System.out.println("--- Must have at least 8 characters \n" +
                    "--- Must contain at least 1 upper case and 1 lower case character \n" +
                    "--- Must not contain number 3 as Gnomes are afraid of both");
            System.out.print("Enter your password: ");
            pasw = scanner.nextLine();

            if (pasw.length() > 6 && pasw.matches(".*[A-Z].*") && pasw.matches(".*[a-z].*") && !pasw.contains("3")) {
                System.out.println("Please repeat the password to make sure you have the memory of Gnome!");

                paswValid = scanner.nextLine();
                if (pasw.equals(paswValid)) {
                    System.out.println("Congratulations, you have successfully become a Gnome! \n Let's find your wife!");
                } else {
                    System.out.println("Soggy - Gnomes, say good bye! Try again later!");}
            } else {
                    System.out.println("Your password is not valid! You have killed your chances of becoming a Gnome!");
                }
        } else {
            System.out.println("You have a mistake in your e-mail, you cannot become a Gnome!");
        }

    }
}
