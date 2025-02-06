package BinaryTreeDS;



// PreOrder=> root, left, right
public class PreOrder implements TreeTraversal{

    @Override
    public void treverse(TreeNode node) {
        if(node == null){
            return;
        }
        System.out.println(node.val);
        treverse(node.left);
        treverse(node.right);
    }
}
