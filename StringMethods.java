import java.util.*;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Allwina Anna";
        
        // Convert the string to a character array and print it
        char[] charArray = name.toCharArray();
        System.out.println(Arrays.toString(charArray));
        
        // Sort the character array
        Arrays.sort(charArray);
        
        // Print the sorted character array
        System.out.println(Arrays.toString(charArray));
    }
}
