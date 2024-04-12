class Solution {
    static long pairAndSum(int n, long arr[]) {
        long ans = 0;

        for (int i = 0; i < 32; i++) {
            long count = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1L << i)) != 0) {
                    count++;
                }
            }
            ans += (1L << i) * (count * (count - 1) / 2);
        }

        return ans;
    }
}
