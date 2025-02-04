import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Gobi SObi";
        
        // Convert string to character array
        System.out.println(Arrays.toString(name.toCharArray()));
        
        // Convert string to lowercase
        System.out.println(name.toLowerCase());
        
        // Original string
        System.out.println(name);
        
        // Find index of first occurrence of 'o'
        System.out.println(name.indexOf("o"));
        
        // Strip leading and trailing spaces
        // System.out.println("               GOBUHI       ".strip());
        
        // Split string by spaces
        System.out.println(Arrays.toString(name.split(" ")));
        
        // Additional string methods
        // Convert string to uppercase
        System.out.println(name.toUpperCase());
        
        // Replace characters in string
        System.out.println(name.replace('o', 'a'));
        
        // Check if string starts with a specific prefix
        System.out.println(name.startsWith("Go"));
        
        // Check if string ends with a specific suffix
        System.out.println(name.endsWith("bi"));
        
        // Get substring from string
        System.out.println(name.substring(0, 4));
    }
}