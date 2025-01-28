public class SearchIn2Darr {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6, 57456, 5647},
            {7, 8, 9, 4554}
        };
        int t = 4554;
        System.out.println(searchIn2Darr(arr, t));
    }

    static int[] searchIn2Darr(int[][] arr, int t) { // Updated return type to int[] to return row and column indices
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == t) {
                    return new int[]{row, col}; // Return both row and column indices
                }
            }
        }
        return new int[]{1, 1}; // Return {-1, -1} if the target is not found
    }
}
