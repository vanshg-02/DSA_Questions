class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long sum=0;
        for(int i=n-1;i>=n/2;i--){
            sum+=nums[i];
        }
        for(int i=n/2-1;i>=0;i--){
            sum-=nums[i];
        }
        
        
        return sum;
    }
}