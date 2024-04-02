class Tree
{
    int height(Node node)
    {
        if(node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    boolean isBalanced(Node root)
    {
        if(root == null)
            return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
}
