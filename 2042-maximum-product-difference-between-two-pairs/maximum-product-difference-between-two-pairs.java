class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int product=1;
        int n=nums.length;
        for(int i=0;i<2;i++){
            product*=nums[n-i-1];
        }
        int product1=1;
        for(int i=0;i<2;i++){
            product1*=nums[i];
        }
        return product-product1;
    }
}