class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] ans=new int[n][n];
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<n;i++){
                
                ans[i][j]=matrix[n-j-1][i];
                
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                matrix[i][j]=ans[i][j];
                
            }
        }
        
    }
}