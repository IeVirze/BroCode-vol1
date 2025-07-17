import java.util.Scanner;
public class happyNewYear {
    public  static void main(String[] args) throws InterruptedException {
        int start = 10;

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); //Togheter with throws exception delay the countdown to be like the real countdown clock

        }

        System.out.println("Happy new year!");
    }
}
