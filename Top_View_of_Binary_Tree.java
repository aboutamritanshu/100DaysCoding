class Solution {
    static ArrayList<Integer> topView(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();
        Queue<Integer> hdQueue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        if (root == null)
            return result;
        
        queue.add(root);
        hdQueue.add(0);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int hd = hdQueue.poll();
            
            if (!map.containsKey(hd)) {
                map.put(hd, current.data);
            }
            
            if (current.left != null) {
                queue.add(current.left);
                hdQueue.add(hd - 1);
            }
            
            if (current.right != null) {
                queue.add(current.right);
                hdQueue.add(hd + 1);
            }
        }
        
        for (int value : map.values()) {
            result.add(value);
        }
        
        return result;
    }
}
