class Solution {
    public boolean halvesAreAlike(String s) {
        String first=s.substring(0,s.length()/2);
        String second=s.substring(s.length()/2,s.length());
        String vowel="aeiou";
        int count1=0;
        int count2=0;
        for(char ch:first.toLowerCase().toCharArray()){
            if(vowel.indexOf(ch)!=-1){
                count1++;
            }
        }
        for(char ch:second.toLowerCase().toCharArray()){
            if(vowel.indexOf(ch)!=-1){
                count2++;
            }
        }
        return count1==count2;
    }
}