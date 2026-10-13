class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        int index=0;
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<n;j++){
                if(heights[j]>max){
                    max=heights[j];
                    index=j;
                }
            }
            heights[index]=0;
            str[i]=names[index];

        }
        return str;
    }
}