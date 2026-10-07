class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[] ans = new int[n * m];
        int k = 0;

        for (int d = 0; d < n + m - 1; d++) {

            if (d % 2 == 0) {

                int row = Math.min(d, n - 1);
                int col = d - row;

                while (row >= 0 && col < m) {
                    ans[k++] = mat[row][col];
                    row--;
                    col++;
                }

            } else {

                int col = Math.min(d, m - 1);
                int row = d - col;

                while (col >= 0 && row < n) {
                    ans[k++] = mat[row][col];
                    row++;
                    col--;
                }
            }
        }

        return ans;
    }
}