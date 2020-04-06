public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
        // solution 1
//        if (root == null)
//            return false;
//        if (root.value == value)
//            return true;
//        if (root.value < value)
//            // value we are searching for is greater than that held by node we are at
//            return contains(root.right, value);
//        else
//            // value we are searching for is greater than that held by node we are at
//            return contains(root.left, value);
//
//        // solution 2
        // Traverse untill root reaches to dead end
        while (root != null) {
            // pass right subtree as new tree
            if (value > root.value)
                root = root.right;
            // pass left subtree as new tree
            else if (value < root.value)
                root = root.left;
            else
                return true; // if the key is found return 1
        }
        return false;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n3, 2));
    }

}

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
