class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();
        findPaths(root, currentPath, paths);
        return paths;
    }
    private static void findPaths(Node node, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> paths) {
        if (node == null) {
            return;
        }

        currentPath.add(node.data);
        if (node.left == null && node.right == null) {
            paths.add(new ArrayList<>(currentPath));
        } else {
            findPaths(node.left, currentPath, paths);
            findPaths(node.right, currentPath, paths);
        }

        currentPath.remove(currentPath.size() - 1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<ArrayList<Integer>> paths = Paths(root);
        for (ArrayList<Integer> path : paths) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        }
    }
}
