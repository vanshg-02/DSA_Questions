class Solution {
    public int digitFrequencyScore(int n) {
        int original = n;
        int score = 0;
        for (int d = 0; d <= 9; d++) {
            int temp = original;
            int count = 0;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == d) {
                    count++;
                }
                temp /= 10;
            }
            score += d * count;
        }
        return score;
    }
}