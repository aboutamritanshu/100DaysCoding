class Solution{
    public static boolean check(long A[], long B[], int N)
    {
        if (N != A.length || N != B.length) {
            return false;
        }

        Map<Long, Integer> mapA = new HashMap<>();
        Map<Long, Integer> mapB = new HashMap<>();

        for (int i = 0; i < N; i++) {
            mapA.put(A[i], mapA.getOrDefault(A[i], 0) + 1);
            mapB.put(B[i], mapB.getOrDefault(B[i], 0) + 1);
        }

        for (Map.Entry<Long, Integer> entry : mapA.entrySet()) {
            Long key = entry.getKey();
            if (!mapB.containsKey(key) || !mapB.get(key).equals(entry.getValue())) {
                return false;
            }
        }

        return true;
    }
}
