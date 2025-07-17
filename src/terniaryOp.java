public class terniaryOp {
    public static void main(String[] args){
        //terniary operator ? = Return 1 of 2 values if a condition is true
        //variable = (condition) ?  ifTrue : ifFalse

        int score = 70;
        /*
        if(score >= 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } */

        String passOrFail = (score >= 60) ? "PASS" : "FAIL"; //alternative to writing if statement that works on correct/false clause


        System.out.println(passOrFail);
    }
}
