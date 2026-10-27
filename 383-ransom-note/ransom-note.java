class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr=new int[26];
        int[] arr1=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            int ascii=(int)ransomNote.charAt(i)-(int)'a';
            arr[ascii]++;
        }
        for(int i=0;i<magazine.length();i++){
            int ascii=(int)magazine.charAt(i)-(int)'a';
            arr1[ascii]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>arr1[i]){
                return false;
            }
        }
        return true;


    }
}