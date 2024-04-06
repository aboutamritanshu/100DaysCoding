class GfG {
    int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLength = i + 1;
            } else {
                if (map.containsKey(sum)) {
                    maxLength = Math.max(maxLength, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }

        return maxLength;
    }
}
