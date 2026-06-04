class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int n =arr.length;
        int mx=arr[0];
        int mi=arr[0];
        for(int i=0;i<n;i++){
            if(mx<arr[i]){
            mx=arr[i];
            }
            if(mi>arr[i]){
                mi=arr[i];
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(mi);
        ans.add(mx);
        return ans;
    }
}
