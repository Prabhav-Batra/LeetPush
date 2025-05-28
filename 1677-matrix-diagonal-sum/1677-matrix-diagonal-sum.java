class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat[0]. length;
        int sum = 0;
        
        for(int i =0 ; i<n; i++){
            for(int j = 0; j<n; j++){
                if (i == j || n-i-1 == j){
                    sum += mat[i][j];
                }
            
            }}
        
            return sum;
        
    }
    }