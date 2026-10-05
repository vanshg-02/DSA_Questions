class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr=sentence.toCharArray();
        Set<Character> ans=new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        if(ans.size()==26){
            return true;
        }
        return false;
    }
}