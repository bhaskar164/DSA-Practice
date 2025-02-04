package BinaryTreeDS;

public class Inorder implements TreeTraversal {
    @Override

    //Traverse in order, left, root, right
    public void treverse(TreeNode node) {
        if (node == null) {
            return;
        }
        treverse(node.left); //visit left node
        System.out.println(node.val); // visit current node
        treverse(node.right); // visit right node
    }
}
