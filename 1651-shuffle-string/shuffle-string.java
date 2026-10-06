class Solution {
    public String restoreString(String s, int[] indices) {
        String[] ans=new String[s.length()];
        for(int i=0;i<s.length();i++){
            
            char str=s.charAt(i);
            ans[indices[i]]=str+"";
        }
        return String.join("",ans);
    }
}