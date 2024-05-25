class Solution {
    long max_Books(int arr[], int n, int k) {
        long max=0;
        long count=0;
        for(int i=0 ; i<n; i++){
            if(arr[i] <= k){
                count += arr[i];
                max = Math.max(count,max);
            }
            else{
                count=0;
            }
        }
        return max;
    }
}
