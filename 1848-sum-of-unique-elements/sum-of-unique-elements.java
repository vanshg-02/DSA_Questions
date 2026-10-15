class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                ans.add(nums[i]);
                
            }
        }
        for(int val:ans){
            sum+=val;
        }
        return sum;
    }
}