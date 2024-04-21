class Solution{

    public void threeWayPartition(int array[], int a, int b)
    {
        int n = array.length;
        int start = 0, end = n - 1;
        for (int i = 0; i <= end;) {
            if (array[i] < a) {

                int temp = array[i];
                array[i] = array[start];
                array[start] = temp;
                start++;
                i++;
            } else if (array[i] > b) {

                int temp = array[i];
                array[i] = array[end];
                array[end] = temp;
                end--;
            } else {
                i++;
            }
        }
    }
