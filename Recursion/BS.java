import java.util.Arrays;

public class BS {
    public static void main(String[] args) {
        int[] arr = {5245, 54, 45, 45, 45, 212, 435, 12, 453, 12345, 231, 45};
        Arrays.sort(arr); // Ensure the array is sorted for binary search
        int target = 231;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}