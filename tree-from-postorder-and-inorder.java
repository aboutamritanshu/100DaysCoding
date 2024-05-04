class GfG {
    Node buildTree(int in[], int post[], int n) {
        return buildTreeHelper(in, post, 0, n - 1, 0, n - 1);
    }
    Node buildTreeHelper(int in[], int post[], int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd)
            return null;
        Node root = new Node(post[postEnd]);
        int rootIndex = findIndex(in, inStart, inEnd, root.data);
        root.left = buildTreeHelper(in, post, inStart, rootIndex - 1, postStart, postStart + rootIndex - inStart - 1);
        root.right = buildTreeHelper(in, post, rootIndex + 1, inEnd, postStart + rootIndex - inStart, postEnd - 1);
        
        return root;
    }
    int findIndex(int arr[], int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1; 
    }
}
