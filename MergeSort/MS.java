

import java.lang.reflect.Array;
import java.util.Arrays;

public class MS {
    public static void main(String[] args) {
        int[] arr ={6,4,32,3,24,24,66,43,14};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;

        int [] left =mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right =mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];

        int i =0;
        int j=0;
        int k=0;
         while (i<first.length && j<second.length){
             if(first[i]<second[j]){
                 mix[k]=first[i];
                 i++;
             }else{
                 mix[k]=second[j];
                 j++;
             }
             k++;
         }
         //it may be possible one of the array is not completed so we need to add the remaining elements
         //copy the remaning elements
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;

    }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
