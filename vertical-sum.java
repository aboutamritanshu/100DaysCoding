class Solution {
    public ArrayList<Integer> verticalSum(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        TreeMap<Integer, Integer> verticalSumMap = new TreeMap<>();
        computeVerticalSum(root, 0, verticalSumMap);
        for (int sum : verticalSumMap.values()) {
            result.add(sum);
        }
        
        return result;
    }
    private void computeVerticalSum(Node node, int hd, TreeMap<Integer, Integer> verticalSumMap) {
        if (node == null)
            return;
        verticalSumMap.put(hd, verticalSumMap.getOrDefault(hd, 0) + node.data);
        computeVerticalSum(node.left, hd - 1, verticalSumMap);
        computeVerticalSum(node.right, hd + 1, verticalSumMap);
    }
}
