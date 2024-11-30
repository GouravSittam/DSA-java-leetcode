import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        // System.out.println();
        int[] arr = {1,2,3,4,56,7,6,7,8,9,0};
        System.out.println(Arrays.toString(arr));
        modify(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void modify(int[] arr){
        arr[3]=200;
    }
    
}
