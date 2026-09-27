class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String val:operations){
            if(val.equals("X++")||val.equals("++X")){
                X++;
            }
            else{
                X--;
            }
        }
        return X;
    }
}