class Solution {
    public int alternatingSum(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans+=nums[0];
            }
            else if(i%2!=0){
                ans-=nums[i];

            }
            else{
                ans+=nums[i];
            }


        }
        return ans;
    }
}