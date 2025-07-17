import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        //.substring() = A method used to extract portion of a string
        //          .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        //Define variables
        String email;
        String password;

        System.out.print("Please enter your e-mail: ");
        email = scanner.nextLine();

        if (email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring((email.indexOf("@") + 1));
            //start - inclusive; end - exclusive
            System.out.printf("Your domain is: %s\n", domain);
            System.out.printf("Your username is: %s", username);

            System.out.print("Please, enter a password of 8 characters: ");
            password = scanner.nextLine();
            if (password.length() == 8){
                System.out.println("Your password is valid");
            }else {
                System.out.println("Your password is valid.");
            }
        }
        else {
            System.out.println("Please enter valid e-mail address.");
        };





        scanner.close();
    }
}
