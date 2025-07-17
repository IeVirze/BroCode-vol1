public class overloadedMethods {
    public static void main(String[] args){
        /* overloaded methods = methods that share the same name,
        but different parameters
        signature (of the method) = name + parameters
         */

        System.out.println(add(1,2));

        //overloaded methods can be multiple as long as name or parameters are different creating a different signature
    }
    static double add(double a, double b) {
        return a+ b;
    }
    static double add(double a, double b, double c) {
        return a+b+c;
    }
}
