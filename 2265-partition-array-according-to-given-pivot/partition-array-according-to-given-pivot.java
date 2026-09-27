class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int k=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans[k]=nums[i];
                k++;
            }
            
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                ans[k]=nums[i];
                k++;
            }
            
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                ans[k]=nums[i];
                k++;
            }
            
        }
        return ans;
    }
}