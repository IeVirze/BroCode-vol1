public class stringMethods {
    public static void main(String[] args){

        //String method demonstration (not full list)

        String name = "Ieva Vītola";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("e"); //index of a character
        int lastIndex = name.lastIndexOf("a");
        //name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim(); //remove white space before and after
        name = name.replace("e", "m"); //replace any character
        //name.isEmpty(); // checks if string is empty true/false

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
    }
}
