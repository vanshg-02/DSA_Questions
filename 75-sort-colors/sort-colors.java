class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int va:nums){
            map.put(va,map.getOrDefault(va,0)+1);
        }
        
        int zero=0,one=0,two=0;
        zero=map.getOrDefault(0,0);
        one=map.getOrDefault(1,0);
        two=map.getOrDefault(2,0);
        int count=0;
        for(int i=0;i<zero;i++){
            nums[count]=0;
            count++;
        }
        for(int i=0;i<one;i++){
            nums[count]=1;
            count++;
        }
        for(int i=0;i<two;i++){
            nums[count]=2;
            count++;
        }
        
        
    }
}