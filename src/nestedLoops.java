public class nestedLoops {
    public static void  main(String[] args){

        //nested loops = a loop inside a loop often used in matrices or data structures

        //for loop to iterate 3x
        //Dont repeat yourself approach
        for (int j = 1; j <= 3; j++) {

            for (int i = 1; i <= 9; i++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
