public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 323, 4, 5};
        System.out.println(max(arr));
    }
    //imagine that array is not empty
    static int max(int[] arr){
        int maxVal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
            
        }
        return maxVal;

    }
    
}


// import java.util.Scanner;

// public class MaxItem {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Prompt the user to enter the number of elements in the array
//         System.out.print("Enter the number of elements in the array: ");
//         int n = scanner.nextInt();
        
//         // Create an array of the specified size
//         int[] arr = new int[n];
        
//         // Prompt the user to enter the elements of the array
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }
        
//         // Call the max function and print the result
//         System.out.println("The maximum value in the array is: " + max(arr));
        
//         // Close the scanner
//         scanner.close();
//     }
    
//     // Method to find the maximum value in an array
//     static int max(int[] arr) {
//         int maxVal = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > maxVal) {
//                 maxVal = arr[i];
//             }
//         }
//         return maxVal;
//     }
// }
