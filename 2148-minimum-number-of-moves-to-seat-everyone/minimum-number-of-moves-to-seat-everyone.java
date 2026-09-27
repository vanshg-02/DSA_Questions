class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=seats.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(seats[i]-students[i]<0){
                ans+=(-1)*(seats[i]-students[i]);
            }
            else{
                ans+=seats[i]-students[i];
            }
        }
        return ans;
    }
}