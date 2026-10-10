class Solution {
    public boolean canAliceWin(int[] nums) {
        int total=0,sum1=0,sum2=0;
        for(int val:nums){
            total+=val;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9 && nums[i]>0){
                sum1+=nums[i];
            }
            if(nums[i]>=10 && nums[i]<=99){
                sum2+=nums[i];
            }
        }
        if(sum1>total-sum1 || sum2>total-sum2){
            return true;
        }
        return false;
    }
}