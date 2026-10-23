class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        int largest=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        int secsma=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
                seclar=largest;
                largest=nums[i];
            }
            else if(nums[i]>seclar){
                seclar=nums[i];
            }
            if(nums[i]<small){
                secsma=small;
                small=nums[i];
            }
            else if(nums[i]<secsma){
                secsma=nums[i];
            }
        }
        
        return (largest*seclar)-(small*secsma);
    }
}