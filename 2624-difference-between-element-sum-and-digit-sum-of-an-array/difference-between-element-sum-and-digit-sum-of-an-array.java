class Solution {
    public int differenceOfSum(int[] nums) {
        int total=0,sum=0;
        for(int val:nums){
            total+=val;
            int c=val;
            while(c>0){
                sum+=c%10;
                c=c/10;
            }
            
        }
        return Math.abs(total-sum);

    }
}