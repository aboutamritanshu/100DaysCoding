class Solution {
    int median(int matrix[][], int R, int C) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < R; i++) {
            if (matrix[i][0] < min) {
                min = matrix[i][0];
            }
            if (matrix[i][C - 1] > max) {
                max = matrix[i][C - 1];
            }
        }

        int desired = (R * C + 1) / 2;
        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0;
            int get = 0;

            for (int i = 0; i < R; ++i) {
                get = Arrays.binarySearch(matrix[i], mid);
                if (get < 0) {
                    get = Math.abs(get) - 1;
                } else {
                    while (get < matrix[i].length && matrix[i][get] == mid) {
                        get++;
                    }
                }

                place = place + get;
            }

            if (place < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        return min;
    }
}
