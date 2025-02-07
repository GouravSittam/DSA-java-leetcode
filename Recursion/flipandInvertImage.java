class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            //reverse the array
            for (int i = 0; i < (image.length+1)/2; i++) {
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[image.length - 1 - i] ^ 1;
                row[image.length - 1 - i] = temp;
                
            }
        }
        return  image;
    }
}