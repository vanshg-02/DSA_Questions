class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int)Math.sqrt(c);
        for (int i = 0; i <= n; i++) {
            int remaining = c - i * i;
            int b = (int)Math.sqrt(remaining);
            if (b * b == remaining) {
                return true;
            }
        }
        return false;
    }
}