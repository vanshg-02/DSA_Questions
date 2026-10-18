class Solution {
    public int findDuplicate(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                ans.add(nums[i]);
                break;
            }
        }
        return ans.get(0);
    }
}