package BinaryTreeDS;


//Assuming we are storing data in integer format in each node
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
