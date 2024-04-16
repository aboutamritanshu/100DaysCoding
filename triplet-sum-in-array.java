class Solution {
    public static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = A[i] + A[left] + A[right];
                if (sum == X) {
                    return true;
                } else if (sum < X) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
}
