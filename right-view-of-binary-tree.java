class Solution {
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (i == size - 1) {
                    result.add(current.data);
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        return result;
    }
}
