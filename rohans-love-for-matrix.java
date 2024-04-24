class Solution {
    static int firstElement(int n) {
        if (n == 0)
            return 0;
        int MOD = 1000000007;
        int[][] base = {{1, 1}, {1, 0}};
        int[][] result = {{1, 0}, {0, 1}};
        while (n > 0) {
            if (n % 2 == 1) {
                result = multiply(result, base, MOD);
            }
            base = multiply(base, base, MOD);
            n /= 2;
        }
        return result[1][0] % MOD;
    }

    static int[][] multiply(int[][] a, int[][] b, int MOD) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                long sum = 0; // Use long to prevent overflow
                for (int k = 0; k < 2; k++) {
                    sum += ((long) a[i][k] * b[k][j]) % MOD;
                    sum %= MOD;
                }
                result[i][j] = (int) sum;
            }
        }
        return result;
    }
}
