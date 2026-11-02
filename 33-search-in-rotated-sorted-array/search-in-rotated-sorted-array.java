class Solution {
    public int search(int[] nums, int target) {
        int ex=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ex=i;
                break;
            }
        }
        return ex;
    }
}