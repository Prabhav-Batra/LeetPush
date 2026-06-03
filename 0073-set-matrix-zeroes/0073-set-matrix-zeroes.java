class Solution {
    public void setZeroes(int[][] matrix) {
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];

        for(int i = 0; i< matrix.length; i++){
            rows[i] = 1;
        }
        for(int i = 0; i< matrix[0].length; i++){
            cols[i] = 1;
        }
        
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    rows[i] = 0;
                    cols[j] = 0;
                }
            }
        }
        for(int i = 0; i < matrix.length ; i++){
            if(rows[i]== 0){
                for (int n = 0; n < matrix[0].length; n++){
                    matrix[i][n] = 0;

                }
            }
            
            }
        for(int i = 0; i < matrix[0].length ; i++){
            if(cols[i]== 0){
                for (int n = 0; n < matrix.length; n++){
                    matrix[n][i] = 0;

                }
            }
            
            }
        }
    }
