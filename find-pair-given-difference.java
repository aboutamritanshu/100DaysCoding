class Solution {
    public int findPair(int n, int x, int[] arr) {
       Arrays.sort(arr);
       int i=0;
       int j=1;
       while(i<n && j<n){
           int diff=(arr[j]-arr[i]);
           if(diff==x && i!=j)
           return 1;
           if(diff<x)
           j++;
           else 
           i++;
       }
       return -1;
    }
}
