class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        int m = n;
        double[] ans = new double[n / 2];
        for (int i = 0; i < n / 2; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minIndex = 0, maxIndex = 0;
            for (int j = 0; j < m; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
                if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }
            ans[i] = (min + max) / 2.0;
            int great = Math.max(minIndex, maxIndex);
            int chotu = Math.min(minIndex, maxIndex);
            for (int j = great; j < m - 1; j++) {
                nums[j] = nums[j + 1];
            }
            m--;
            for (int j = chotu; j < m - 1; j++) {
                nums[j] = nums[j + 1];
            }
            m--;
        }
        double mini = ans[0];
        for (int i = 1; i < ans.length; i++) {
            mini = Math.min(ans[i], mini);
        }
        return mini;
    }
}
