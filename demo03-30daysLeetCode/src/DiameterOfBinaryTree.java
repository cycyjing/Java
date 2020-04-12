public class DiameterOfBinaryTree {
    int length;

    public int diameterOfBinaryTree(TreeNode root) {
        length = 1;
        count(root);
        return length - 1;
    }

    public int count(TreeNode node) {
        if (node == null)
            return 0;
        int left = count(node.left);
        int right = count(node.right);
        length = Math.max(length, left + right + 1);
        return Math.max(left, right) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}