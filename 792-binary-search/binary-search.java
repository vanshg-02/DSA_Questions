class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int end=n-1;
        int beg=0;
        for(int i=0;i<n;i++){
            int mid=(end+beg)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                beg=mid+1;
            }
            else{
                end=mid;
            }
        }
        return -1;
    }
}