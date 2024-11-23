import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        //create a arrray

        int [] arr={1,2,3,4,34,32,12,32,131};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[7]=99;//coz here we modifiying the array(if you change the value of array it will change the value of array)
    }
    
}
