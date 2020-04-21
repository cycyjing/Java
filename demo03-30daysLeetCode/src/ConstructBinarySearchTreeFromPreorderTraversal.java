//https://www.cnblogs.com/Dylan-Java-NYC/p/11119359.html

public class ConstructBinarySearchTreeFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null || preorder.length <= 0)
            return null;
//        TreeNode node = new TreeNode(preorder[0]);
//        for (int i = 1; i < preorder.length; i++) {
//
//        }
        return dfs(preorder, 0, preorder.length - 1);
    }

    private TreeNode dfs(int[] preorder, int l, int r) {
        if (l > r)
            return null;

        TreeNode root = new TreeNode(preorder[l]);
        int biggerIndex = l + 1;
        while (biggerIndex <= r && preorder[biggerIndex] < preorder[l])
            biggerIndex++;

        root.left = dfs(preorder, l + 1, biggerIndex - 1);
        root.right = dfs(preorder, biggerIndex, r);
        return root;
    }


    public static void main(String[] args) {
        ConstructBinarySearchTreeFromPreorderTraversal bst = new ConstructBinarySearchTreeFromPreorderTraversal();
        TreeNode tn = bst.bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12});
        System.out.println(tn);
    }
}

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}