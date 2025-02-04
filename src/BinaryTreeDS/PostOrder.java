package BinaryTreeDS;

public class PostOrder implements TreeTraversal{
    @Override
    public void treverse(TreeNode node) {
        if(node == null){
            return;
        }
        treverse(node.left);
        treverse(node.right);
        System.out.println(node.val);
    }
}
