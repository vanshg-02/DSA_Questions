class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int count=0,freq=0;
        for(int val:nums){
            if(val<target){
                count++;
            }
            if(val==target){
                freq++;
            }
        }
        for(int i=0;i<freq;i++){
            ans.add(count+i);
        }
        return ans;
    }
}