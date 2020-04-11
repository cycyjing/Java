public class DiameterOfBinaryTree {
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        length(root);
        return ans - 1;
    }

    public int length(TreeNode node) {
        if (node == null)
            return 0;
        int left = length(node.left);
        int right = length(node.right);
        ans = Math.max(ans, left + right + 1);
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