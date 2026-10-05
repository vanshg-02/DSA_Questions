class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i=97;i<123;i++){
            char ch=(char)i;
            if(!sentence.contains(String.valueOf(ch))){
                return false;
            }
        }
        return true;
    }
}