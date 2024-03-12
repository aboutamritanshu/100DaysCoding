class Solution {
    public static void convertToWave(int n, int[] a) {
        for (int i = 0; i < n - 1; i += 2) {
            if (i > 0 && a[i] < a[i - 1]) {
                swap(a, i, i - 1);
            }
            if (i < n - 1 && a[i] < a[i + 1]) {
                swap(a, i, i + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
