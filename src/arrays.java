import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
    public static void  main(String[] args) {
        //arrays
        String[] fruit = {"apple", "orange", "banana","coconut"};

        //enhanced for loop

        Arrays.sort(fruit); //built in class for arrays, contain many functions
        Arrays.fill(fruit, "pineapple" );

        for (String fruits : fruit){
            System.out.println(fruits);
        }
    }
}
