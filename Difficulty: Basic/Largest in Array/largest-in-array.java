class Solution {
    public static int largest(int[] arr) {
        // code here
        int n=arr.length;
       int m=arr[0];
        for(int i=0;i<n;i++){
            if(m<arr[i]){
                m=arr[i];
            }
        }
        return m;
    }
}
