class Solution {
    private void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[v] = true;
        result.add(v);
        
        for (int u : adj.get(v)) {
            if (!visited[u]) {
                dfs(u, adj, visited, result);
            }
        }
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        
        dfs(0, adj, visited, result);
        
        return result;
    }
}
