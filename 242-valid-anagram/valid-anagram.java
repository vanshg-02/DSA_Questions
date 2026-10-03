class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n=s.length();
        int[] ans1=new int[n];
        int[] ans2=new int[n];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            ans1[i]=(int)ch;
        }
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            ans2[i]=(int)ch;
        }
        Arrays.sort(ans1);
        Arrays.sort(ans2);
        for(int i=0;i<n;i++){
            if(ans1[i]!=ans2[i]){
                return false;
            }
        }
        return true;
    }
}