class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums2[j]==nums1[i]){
                    int temp=-1;
                    for(int k=j+1;k<m;k++){
                        if(nums2[k]>nums2[j]){
                            temp=nums2[k];
                            break;
                        }
                    }
                    ans[i]=temp;
                }
            }
        }
        return ans;
    }
}