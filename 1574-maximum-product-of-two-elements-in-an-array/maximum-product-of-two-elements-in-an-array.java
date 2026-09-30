class Solution {
    public int maxProduct(int[] nums) {
        int[] temp=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        int highest=temp[n-1];
        int second=temp[n-2];
        return (highest-1)*(second-1);
        
    }
}