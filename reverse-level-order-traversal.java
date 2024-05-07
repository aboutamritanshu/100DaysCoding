class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        queue.add(node);

        while (!queue.isEmpty())
        {
            Node curr = queue.poll();
            stack.push(curr);

            if (curr.right != null)
                queue.add(curr.right);

            if (curr.left != null)
                queue.add(curr.left);
        }

        while (!stack.isEmpty())
        {
            Node curr = stack.pop();
            result.add(curr.data);
        }

        return result;
    }
}    
