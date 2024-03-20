class Solution {
    private int maxSum = 0;
    private int maxPathLength = 0;

    public int sumOfLongRootToLeafPath(Node root) {
        if (root == null) {
            return 0;
        }

        int[] path = new int[1000]; 
        int pathLength = 0;
        dfs(root, path, pathLength);
        return maxSum;
    }

    private void dfs(Node node, int[] path, int pathLength) {
        if (node == null) {
            return;
        }

        path[pathLength] = node.data;
        pathLength++;

        if (node.left == null && node.right == null) {
            int sum = 0;
            for (int i = 0; i < pathLength; i++) {
                sum += path[i];
            }

            if (pathLength > maxPathLength) {
                maxPathLength = pathLength;
                maxSum = sum;
            } else if (pathLength == maxPathLength) {
                maxSum = Math.max(maxSum, sum);
            }
        } else {
            dfs(node.left, path, pathLength);
            dfs(node.right, path, pathLength);
        }

        pathLength--;
    }
}
