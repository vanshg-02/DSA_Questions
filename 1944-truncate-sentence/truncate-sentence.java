class Solution {
    public String truncateSentence(String s, int k) {
        String[] rem =new String[k];
        String[] ans=s.trim().split("\\s+");
        for(int i=0;i<k;i++){
            rem[i]=ans[i];
        }
        return String.join(" ",rem);
    }
}