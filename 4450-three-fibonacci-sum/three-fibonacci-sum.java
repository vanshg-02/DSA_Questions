class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0,b=1,c=1;
        if(n==0||n==2){
            return true;
        }
        while(true){
            int sum=a+b+c;
            if(sum==n){
                return true;
            }
            if(sum>n){
                return false;
            }
            a=b;
            b=c;
            c=a+b;
        }
        
        
    }
    
}