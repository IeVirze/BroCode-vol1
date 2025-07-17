import java.sql.SQLOutput;
import java.util.Random; //import class random

public class randClass {
    public static void main(String[] args) {
        //demonstration for random number generation
        Random random = new Random();

        int num;
            //without boundaries generates random number between positive billion and negative billion
        num = random.nextInt();

        System.out.println(num);

        //With boundaries can generate any random number for specific range like dice
        num = random.nextInt(1, 7); //first boundary is inclusive, end boudary is exclusive
        /* inclusive means generate 1 or any number bigger than 1
        exclusive means generate any number that is smaller than 7 if we take example
         */
        System.out.println(num);

        //Roll 3 dice

        int dice1;
        int dice2;
        int dice3;

        //generate random numbers for dice 1-6
        dice1 = random.nextInt(1, 7);
        dice2 = random.nextInt(1, 7);
        dice3 = random.nextInt(1, 7);

        //print each dice roll result
        System.out.println("On 1st dice rolled: " + dice1);
        System.out.println("On 2nd dice rolled: " + dice2);
        System.out.println("On 3rd dice rolled: " + dice3);

        //Generate random double by default generates random number between 1 and 0
        double numDec;

        numDec = random.nextDouble();
        System.out.println(numDec);

        //Generate random boolean good for occassions where there needs to be made a random choice like flip-a-coin

        boolean isHeads;
        isHeads = random.nextBoolean();
        System.out.println(isHeads);

    }
}
