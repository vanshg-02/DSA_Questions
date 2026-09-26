class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int[] ans=new int[2];
        while(i<n){
            int j=i+1;
            while(j<n){
            if(nums[i]+nums[j]==target){
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
            j++;
            }
            i++;
        }
        return ans;
    }
}