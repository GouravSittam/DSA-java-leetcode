public class SearchStr {
    public static void main(String[] args) {
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;

        }
        //run a for loop 
        for(int index =0; index<arr.length; index++){
            //check for element at every index if it is equal to target then return the index of that item in array arr
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found  in array so return -1
        return -1;


    }

   
}
