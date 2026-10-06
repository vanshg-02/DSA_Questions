class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                
            }
            else if(ch==')'){
                count--;
                if(count<0){
                    count=0;
                    ans++;
                }
            }

        }
        return ans+count;
    }
}