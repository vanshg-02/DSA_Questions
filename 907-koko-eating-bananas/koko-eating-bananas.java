class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        int low = 1;
        int high = 0;
        for(int val : piles){
            high = Math.max(high, val);
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            long hours = 0;
            for(int val : piles){
                hours += (long)Math.ceil((double)val / (double)mid);
            }
            if(hours <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
}