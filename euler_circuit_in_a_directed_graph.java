class Solution {
    public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
       
        boolean[] visited = new boolean[v];
        if (!isConnected(0, visited, adj)) {
            return false;
        }

   
        int[] degree = new int[v];
        for (int i = 0; i < v; i++) {
            degree[i] = adj.get(i).size();
        }


        int oddDegreeCount = 0;
        for (int i = 0; i < v; i++) {
            if (degree[i] % 2 == 1) {
                oddDegreeCount++;
            }
        }

        if (oddDegreeCount > 2 || (oddDegreeCount == 2 && !isConnected(0, visited, adj))) {
            return false;
        }

        return true;
    }

    private boolean isConnected(int curr, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        if (visited[curr]) {
            return false;
        }

        visited[curr] = true;

        for (int next : adj.get(curr)) {
            if (!visited[next]) {
                if (!isConnected(next, visited, adj)) {
                    return false;
                }
            }
        }

        return true;
    }
}
