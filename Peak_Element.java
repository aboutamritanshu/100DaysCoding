class Solution {
    public int peakElement(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
