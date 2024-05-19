class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        int low = 0;
        int high = n - 1;
        int closest = arr[0];
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (Math.abs(arr[mid] - k) < Math.abs(closest - k) || 
               (Math.abs(arr[mid] - k) == Math.abs(closest - k) && arr[mid] > closest)) {
                closest = arr[mid];
            }
            
            if (arr[mid] < k) {
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                return arr[mid]; 
            }
        }
        
        return closest;
    }
}
