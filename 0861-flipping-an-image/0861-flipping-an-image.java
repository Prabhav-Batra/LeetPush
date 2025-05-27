class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][] arr = new int [image.length][image.length];
        for(int i = 0; i< image.length; i++){
            for(int j = 0; j<image[i].length; j++){
                if (image[i][image.length- j -1]==1){
                arr[i][j] = 0;
                }
                else{
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
}