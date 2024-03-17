class Solution
{
    boolean isBST(Node root)
    {
        return isBSTUtil(root, null, null);
    }

    boolean isBSTUtil(Node node, Integer min, Integer max)
    {
        if (node == null)
            return true;

        if ((min != null && node.data <= min) || (max != null && node.data >= max))
            return false;

        return isBSTUtil(node.left, min, node.data) && isBSTUtil(node.right, node.data, max);
    }
}
