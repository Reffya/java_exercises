package ch.reffya.part2;
/*
The goal of this exercise is to refresh the imperative programming concepts seen in the C language.
This covers data types, operations, if then else, switch, arrays, loop, etc...

The main method is already completed, you just have to fill the remaining method while following the provided
instructions.

Once you are done you can run the test file in test/java/ch/reffya/imperativeTests.java
*/
public class imperative {
    /**
     * This is the main method where the program starts, it is already completed so do ot touch it.
     * @param args the args given by the command line, we won't use it
     */
    public static void main(String[] args){

        // use this to test stuff
    }


    /**
     * Find the max value in the array, you will have to use a for loop for this.
     * pro-tip: if you type for, fori or fore then hit tab, the basic layout is done for you. Use one of those.
     * @param input
     * @return
     */
    public static int findMax(int[] input){
        int max = Integer.MIN_VALUE;
        // TODO
        return max;
    }

    /**
     * Here you have to transform a String and put it each lowercase letter to uppercase. You can ignore characters
     * with accents such as ç, only treat a-z.
     * @param input any String that is not null
     * @return A String where every lowercase letter is converted into an uppercase letter
     */
    public static String toUppercase(String input){
        // little help from me
        char[] toUppercase = input.toCharArray();
        // TODO
        return String.valueOf(toUppercase);
    }
}