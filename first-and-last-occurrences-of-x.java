class GFG {
    ArrayList<Integer> find(int arr[], int n, int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int first = findFirst(arr, n, x);
        int last = findLast(arr, n, x);
        result.add(first);
        result.add(last);
        return result;
    }

    private int findFirst(int arr[], int n, int x) {
        int low = 0, high = n - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    private int findLast(int arr[], int n, int x) {
        int low = 0, high = n - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
