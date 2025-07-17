public class mathClass {
    public static void main(String[] args){

        //Math class by default offer to access some math constants, like:
        //PI value
        //System.out.println(Math.PI);
        // E constant also known as eulers number
        //System.out.println(Math.E);

        //Math methods
        double result;

        result = Math.pow(2, 3); //2 to the power of 3
        result = Math.abs(-5); //absolute value method ( how far from 0 is it)
        result = Math.sqrt(9); //square root of 9
        result = Math.round(3.14); //round the number to the nearest full intiger
        result = Math.ceil(3.14); //to always round up
        result = Math.floor(3.99); //to always round down
        result = Math.max(10, 20); //maximum value between two values, similar for min
        System.out.println(result);

        //
    }
}
