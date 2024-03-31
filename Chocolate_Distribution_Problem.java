class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (n < m) {
            return -1;
        }

        Collections.sort(a);

        long minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = a.get(i + m - 1) - a.get(i);
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
