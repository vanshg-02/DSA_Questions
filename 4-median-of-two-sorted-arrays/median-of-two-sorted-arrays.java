class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length+nums2.length];
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }
            else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<n){
            ans[k++]=nums1[i++];
        }
        while(j<m){
            ans[k++]=nums2[j++];
        }
        int a=ans.length;
        double sum=0;
        if(a%2==0){
            sum+=ans[a/2];
            sum+=ans[a/2-1];
            sum=sum/2;
        }
        else{
            sum+=ans[a/2];
        }
        return sum;
    }
}