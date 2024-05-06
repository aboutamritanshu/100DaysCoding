class Tree {
    ArrayList<Integer> noSibling(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current.left != null && current.right != null) {
                stack.push(current.left);
                stack.push(current.right);
            } else if (current.left != null) {
                result.add(current.left.data);
                stack.push(current.left);
            } else if (current.right != null) {
                result.add(current.right.data);
                stack.push(current.right);
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        } else {
            Collections.sort(result);
        }

        return result;
    }
}
