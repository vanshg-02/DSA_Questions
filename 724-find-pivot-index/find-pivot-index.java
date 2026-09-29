// class Solution {
//     public int pivotIndex(int[] nums) {
//         int n=nums.length;
//         int leftSum=nums[0];
//         int rightSum=nums[n-1];
//         int i=1;
//         int j=n-2;
//         int total=0;
//         for(int val:nums){
//             total+=val;
//         }
//         while(i<j){
//             if(leftSum<total/2){
//                 leftSum+=nums[i];
//                 i++;
//             }
//             if(rightSum<total/2){
//                 rightSum+=nums[j];
//                 j--;
//             }
//             if(leftSum==rightSum){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int x : nums) {
            total += x;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}