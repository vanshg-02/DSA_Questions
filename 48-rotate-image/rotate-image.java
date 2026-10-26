class Solution {
    public void rotate(int[][] matrix) {
        // int n=matrix.length;
        // int[][] ans=new int[n][n];
        // for(int j=n-1;j>=0;j--){
        //     for(int i=0;i<n;i++){  
        //         ans[i][j]=matrix[n-j-1][i];    
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){   
        //         matrix[i][j]=ans[i][j];
        //     }
        // }
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;
            while(low<high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        }
    }
}