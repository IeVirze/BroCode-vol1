public class printFormat {
    public static void main(String[] args){
        //printf() = is a method used to format output
        //%[flags][width][.precision][specifier-character]

        //Create features of a character for example of formating
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        //specifier characters - s - string, c char, f floating point/double, b boolean
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.2f centimeters tal\n", height); //precision of 2 decimal points for floating point
        System.out.printf("Employed:  %b\n", isEmployed);

        //in same line
        System.out.printf("%s is %d years old", name, age);

        //flags:
        // + = output a plus
        // , = comma grouping separator (split thousands etc. visually easier readable)
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        //width
        //0 = zero padding
        // number = right justified padding
        // negative number = left justified padding
    }
}
