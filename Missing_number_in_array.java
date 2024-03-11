class Solution {
    int missingNumber(int array[], int n) {
        int firstsum = 0;
        for(int i = 0; i<n-1;i++) {
            firstsum = firstsum + array[i];
        }
        int secondsum = n*(n+1)/2;
        int difference = secondsum - firstsum;
        return difference;
      
    }
}
