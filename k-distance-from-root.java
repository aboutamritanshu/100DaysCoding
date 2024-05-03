class Tree {
    ArrayList<Integer> Kdistance(Node root, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        KdistanceUtil(root, k, 0, result);
        return result;
    }

    void KdistanceUtil(Node node, int k, int level, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        if (level == k) {
            result.add(node.data);
        } else {
            KdistanceUtil(node.left, k, level + 1, result);
            KdistanceUtil(node.right, k, level + 1, result);
        }
    }
}
