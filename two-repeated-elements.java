class Solution
{

    public int[] twoRepeated(int arr[], int n)
    {
        int[] result = new int[2];
        
        for (int i = 0; i < n + 2; i++) {
            int absValue = Math.abs(arr[i]);
            if (arr[absValue - 1] > 0) {
                arr[absValue - 1] = -arr[absValue - 1];
            } else {
                if (result[0] == 0) {
                    result[0] = absValue;
                } else {
                    result[1] = absValue;
                    break;
                }
            }
        }
        
        return result;
    }
}
