class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[] ans=new int[score.length];
        for(int i=0;i<score.length;i++){
            ans[i]=score[i];
        }
        String[] str=new String[score.length];
        Arrays.sort(ans);
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(ans[i]==score[j]){
                    if(i==n-1){
                        str[j]="Gold Medal";
                    }
                    else if(i==n-2){
                        str[j]="Silver Medal";
                    }
                    else if(i==n-3){
                        str[j]="Bronze Medal";
                    }
                    else{
                        str[j]=String.valueOf(n-i);
                    }
                }
            }
        }
        return str;
    }
}