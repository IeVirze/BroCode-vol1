public class breakContinue {
    public static void main(String[] args){

        //break = break out of the loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for (int i = 0; i <10; i++){
            if (i == 8) {
                break;
            }else if (i == 6 ) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
