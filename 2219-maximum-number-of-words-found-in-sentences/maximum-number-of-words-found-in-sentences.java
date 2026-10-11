class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxcount=0;
        for(int i=0;i<sentences.length;i++){
            int count=0;
            for(int j=0;j<sentences[i].length();j++){
                char ch=sentences[i].charAt(j);
                
                if(ch==' '){
                    count++;
                }
            }
            
            
            maxcount=Math.max(count+1,maxcount);
        }
        return maxcount;
    }
}