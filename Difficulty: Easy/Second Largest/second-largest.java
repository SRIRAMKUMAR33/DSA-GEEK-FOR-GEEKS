class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int m=-1;
        int m1=-1;
        for(int i=0;i<n;i++){
            if(m==arr[i]&&m1==arr[i]){
                return -1;
            }
            if(m<arr[i]){
                m1=m;
                m=arr[i];
            }
            else if(m1<arr[i]&&m!=arr[i]){
                m1=arr[i];
            }
        }
        return m1;
    }
}