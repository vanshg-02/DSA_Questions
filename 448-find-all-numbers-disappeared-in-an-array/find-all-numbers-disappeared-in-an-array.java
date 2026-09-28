class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Set<Integer> list=new HashSet<>();
        for(int val:nums){
            list.add(val);
        }
        for(int i=1;i<=nums.length;i++){
            if(!list.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}