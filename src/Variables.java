public class Variables {
    public static void main(String[] args){
        // 2 steps to creating a variable
        //1. declaration
        //2. assignment

        //variable int - integer (only whole numbers - integers)
        int age = 21;

        System.out.println(age);

        //double  - number that can contain decimal (if stores integer adds dot and 0)
        double price = 19.99;
        double gpa = 3.5;

        System.out.println(price + " euro");

        // char - single charachter

        char grade = 'A';
        char symbol = '!';

        System.out.println(grade);

        //boolean - true or false
        boolean isStudent = true; //write in camel case
        boolean forSale = false;

        System.out.println("is bag for sale? " + forSale);

        //usually boolean is used in code not as direct output like this if statement
        if(isStudent){
            System.out.println("You are a student!");
        }
        else {
            System.out.println("Not student");}

        //for more advanced reference Java documentation

        //string - series of characters, string - double quotes, char single quotes

        String name = "Ieva";

        System.out.println("Hello " + name);

    }
}
