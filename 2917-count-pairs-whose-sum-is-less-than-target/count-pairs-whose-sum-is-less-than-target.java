class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int i = 0;
        int j = 1;
        int count = 0;

        while (i < n) {

            while (j < n) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }

                j++;
            }

            i++;
            j = i + 1;
        }

        return count;
    }
}