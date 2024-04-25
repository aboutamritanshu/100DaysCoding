class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                int sum = mat[i][j] + mat[i][j + 1] + mat[i][j + 2]
                        + mat[i + 1][j + 1]
                        + mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2];

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum == Integer.MIN_VALUE ? -1 : maxSum;
    }
}
