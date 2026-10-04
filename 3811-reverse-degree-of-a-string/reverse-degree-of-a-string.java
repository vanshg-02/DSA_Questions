class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int value = 26 - (ch - 'a');
            ans+=(i+1)*value;
        }
        return ans;
        
    }
}