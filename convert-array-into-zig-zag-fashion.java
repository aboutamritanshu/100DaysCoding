class Solution {
    public static void zigZag(int n, int[] arr) {

        for(int i = 0 ; i <  n-1 ; i++)
        {
            if(i%2==0)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            if(i%2!=0)
            {
                if(arr[i]<arr[i+1])
                {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
