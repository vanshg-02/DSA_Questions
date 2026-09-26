class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int beg = 0;
        int end = m * n - 1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            int a = mid / n;
            int b = mid % n;
            if (matrix[a][b] == target) {
                return true;
            }
            else if (matrix[a][b] < target) {
                beg = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}