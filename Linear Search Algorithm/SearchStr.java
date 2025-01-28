public class SearchStr {
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,60,70,80,90,100};
        int target=50;
        System.out.println(linearSearch(arr, target,1,3));
    }

    static int linearSearch(int[] arr, int target, int s,int e){
        if(arr.length==0){
            return -1;

        }
        //run a for loop 
        for(int index =s; index<=e; index++){
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
