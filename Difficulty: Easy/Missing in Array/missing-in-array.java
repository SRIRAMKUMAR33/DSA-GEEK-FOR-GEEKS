class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        long formula=(long)n*(n+1)/2;
        long sum=0;
        for(int num:arr){
            sum+=num;
        }
        return (int)(formula-sum);
    }
}