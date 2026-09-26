class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int smallest=prices[0];
        int max=0;
        for(int i=1;i<n;i++){
            int profit=prices[i]-smallest;
            max=Math.max(profit,max);
            smallest=Math.min(smallest,prices[i]);
        }
        return max;
        
    }
}