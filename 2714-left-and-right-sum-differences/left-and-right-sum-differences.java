class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] leftSum=new int[n];
        int[] rightSum=new int[n];
        int[] answ=new int[n];
        leftSum[0]=0;
        int ans=0;
        for(int i=0;i<n-1;i++){
            ans+=nums[i];
            leftSum[i+1]=ans;
        }
        ans=0;
        for(int i=n-2;i>=0;i--){
            ans+=nums[i+1];
            rightSum[i]=ans;
        }
        rightSum[n-1]=0;
        for(int i=0;i<n;i++){
            if(leftSum[i]-rightSum[i]<0){
                answ[i]=(-1)*(leftSum[i]-rightSum[i]);
            }
            else{
                answ[i]=leftSum[i]-rightSum[i];
            }
        }
        return answ;
        
    }
}