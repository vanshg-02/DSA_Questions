class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans=new int[2];
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int val:nums1){
            l1.add(val);
        }
        for(int val:nums2){
            l2.add(val);
        }
        int count=0;
        for(int i=0;i<nums1.length;i++){
            if(l2.contains(nums1[i])){
                count++;
            }
        }
        int count1=0;
        for(int i=0;i<nums2.length;i++){
            if(l1.contains(nums2[i])){
                count1++;
            }
        }
        ans[0]=count;
        ans[1]=count1;
        return ans;

    }
}