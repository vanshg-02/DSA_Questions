class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        int n=nums.length;
        int i=0,j=1,k=0;
        while(k<ans.length&&j<nums.length){
            if(nums[i]!=nums[j]){
                j++;
                
                if(j==n){
                    i++;
                    j=i+1;
                }
                continue;
            }
            ans[k]=nums[i];
            k++;
            i++;
            j=i+1;
        }
        return ans;

    }
}