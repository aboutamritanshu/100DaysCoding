class Tree {
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        serializeHelper(root, result);
        return result;
    }

    private void serializeHelper(Node root, ArrayList<Integer> result) {
        if (root == null) {
            result.add(-1); 
            return;
        }
        result.add(root.data);
        serializeHelper(root.left, result);
        serializeHelper(root.right, result);
    }

    public Node deSerialize(ArrayList<Integer> A) {
        if (A == null || A.isEmpty() || A.get(0) == -1) {
            return null;
        }
        Iterator<Integer> iterator = A.iterator();
        return deSerializeHelper(iterator);
    }

    private Node deSerializeHelper(Iterator<Integer> iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        Integer val = iterator.next();
        if (val == -1) {
            return null;
        }
        Node root = new Node(val);
        root.left = deSerializeHelper(iterator);
        root.right = deSerializeHelper(iterator);
        return root;
    }
}
