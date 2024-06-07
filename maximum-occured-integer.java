class Solution {
    public static int maxOccured(int n, int l[], int r[], int maxx) {
         int[] count = new int[maxx + 1];
        for (int i = 0; i < n; i++) {
            count[l[i]]++;
            if (r[i] + 1 <= maxx) {
                count[r[i] + 1]--;
            }
        }        
        int max = 0;
        int maxCount = 0;
        for (int i = 1; i <= maxx; i++) {
            count[i] += count[i - 1];
            if (maxCount < count[i]) {
                max = i;
                maxCount = count[i];
            }
        }        
        return max;
 
    }
}
