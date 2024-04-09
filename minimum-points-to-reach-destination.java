class Solution {
    public int minPoints(int points[][], int m, int n) {
        int dp[][] = new int[m][n];
        int minPoints[][] = new int[m][n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1)
                    minPoints[i][j] = Math.max(1, 1 - points[i][j]);
                else if (i == m - 1)
                    minPoints[i][j] = Math.max(1, minPoints[i][j + 1] - points[i][j]);
                else if (j == n - 1)
                    minPoints[i][j] = Math.max(1, minPoints[i + 1][j] - points[i][j]);
                else
                    minPoints[i][j] = Math.max(1, Math.min(minPoints[i + 1][j], minPoints[i][j + 1]) - points[i][j]);
            }
        }
        return minPoints[0][0];
    }
}
