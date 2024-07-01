class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int[][] result=new int[matrix[0].length][matrix.length];
        for(int i= 0; i<n;i++){
            for(int j=0; j<matrix[i].length;j++){
                
                result[j][i] = matrix[i][j];
                
            }
        }
        return result;
    }
}