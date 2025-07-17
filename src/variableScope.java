public class variableScope {

    //class variable is defined within a class but not within methods
    static int x = 3; //CLASS scope
    //LOCAL variables with the same name are preffered over the class scope
    //usually stick with method variables
    //unless need static value or object oriented programming

    public static void main(String[] args) {

        //local variable (always within a method



        int x = 1; //LOCAL

        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x = 2; //LOCAL to doSomething
        System.out.println(x);

        //same name variable can be created as long as it is local scope and can be found in different local location like method
    }
}
