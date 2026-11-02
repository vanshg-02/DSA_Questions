class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int beg=0;
        int end=n-1;
        for(int i=0;i<n;i++){
            int mid=(end+beg)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                beg=mid+1;
            }
            else{
                end=mid;
            }
        }return -1;
    }
}