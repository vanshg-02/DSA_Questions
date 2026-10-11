
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            int min = matrix[i][0];
            int index = 0;

            for (int k = 1; k < m; k++) {
                if (matrix[i][k] < min) {
                    min = matrix[i][k];
                    index = k;
                }
            }

            boolean lucky = true;

            for (int j = 0; j < n; j++) {
                if (matrix[j][index] > min) {
                    lucky = false;
                    break;
                }
            }

            if (lucky) {
                ans.add(min);
            }
        }

        return ans;
    }
}
