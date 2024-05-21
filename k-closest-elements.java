class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        // code here-
       
        int ans[] = new int[k];
         int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) {
                j=i;
                break;
            }
            if(arr[i]>x){
                j=i-1;
                break;
            }
        }

        int m=j+1;

        for(int i=0;i<k;i++){
            if(j>=0 && arr[j]==x) j--;
            if(m<n && arr[m]==x) m++;
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;
            
            
            if(j>=0)
             left=Math.abs(arr[j]-x);
            if(m<arr.length)
             right = Math.abs(arr[m]-x);
            if(left<right ){
                ans[i]=arr[j--];
                
                
            }
            else if(m<arr.length)
            ans[i]=arr[m++];
            
        }
       
        return ans;
    }
}
