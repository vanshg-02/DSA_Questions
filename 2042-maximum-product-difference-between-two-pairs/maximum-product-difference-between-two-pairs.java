class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        int largest=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        int secsma=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>largest){
                seclar=largest;
                largest=num;
            }
            else if(num>seclar){
                seclar=num;
            }
            if(num<small){
                secsma=small;
                small=num;
            }
            else if(num<secsma){
                secsma=num;
            }
        }
        
        return (largest*seclar)-(small*secsma);
    }
}