public class FindMin {
    public static void main(String[] args) {
        int[] arr={5,54,52,45,2,4554,2,545,2,462,452,541};
        System.out.println(findMin(arr));
        
    }
    //search in the array: return the index if the item found  or -1 otherwise
    static int findMin(int[] arr){
        int ans = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    
    
    
}
