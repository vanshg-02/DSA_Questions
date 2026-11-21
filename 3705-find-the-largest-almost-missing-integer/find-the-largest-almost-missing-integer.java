import java.util.*;
class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Only one subarray exists
        if(n == k) {
            int max = Integer.MIN_VALUE;

            for(int num : nums) {
                max = Math.max(max, num);
            }

            return max;
        }

        int ans = -1;

        // Special case: k = 1
        if(k == 1) {
            for(int num : nums) {
                if(map.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }

        // Check first element
        if(map.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }

        // Check last element
        if(map.get(nums[n-1]) == 1) {
            ans = Math.max(ans, nums[n-1]);
        }

        return ans;
    }
}
