public class arithmeticOperators {
    public static void main(String[] args) {

        //Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        //addition
        z = x + y;
        System.out.println(z);

        //subtraction
        z = x - y;
        System.out.println(z);

        //multiplication
        z = x * y;
        System.out.println(z);

        //division
        z = x / y;
        System.out.println(z);

        //Remainder of division
        z = x % y; // x modulus y if need to determin if it is even or not or for time
        System.out.println(z);

        //Augmented Assignment Operators
        //Define new variables
        int n = 10;
        int i = 3;

        //to add both togheter and store the result in n
        n = n + i; //technically works
        System.out.println(n);

        //add n to i store in n
        n += i;

        n -= i; //n = n - i
        n *= i; // n = n * i
        n /= i; // n = n / i
        n %= i; // n = n % i

        // Increment and Decrement Operators
         int a = 1;

         //if incrementing by 1
        a++; //a+1
        a++; //a+1+1

        a--; //a - 1

        //Order of operations [P-E-M-D-A-S]
        /*  P - Prenteses ()
            E - exponents
            M - multiplication
            D - division
            A - addition
            S - subtraction
         */

        double result = 3 + 4 * ( 7 - 5) / 2.0;
        /*
        3 + 4 * 2 / 2.0
        3 + 8 / 2.0
        3 + 4
        7
         */
    }
}
