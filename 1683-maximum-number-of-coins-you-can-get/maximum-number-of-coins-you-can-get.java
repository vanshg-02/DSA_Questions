class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int j=piles.length/3;
        int i=piles.length-2,sum=0;
        while(j>0){
            sum+=piles[i];
            i=i-2;
            j--;
        }
        return sum;
    }
}