import BinaryTreeDS.*;
import BinaryTreeDS.Services.GenerateTreeService;

public class Main {
    public static void main(String[] args) {
        //Test Tree Traversals
        String separator = "----------------------------------------------------------------------------------------";

        TreeNode root = GenerateTreeService.createTree();
        TreeTraversal treeTraversal = new Inorder();
        treeTraversal.treverse(root);

        System.out.println(separator);
        TreeTraversal preOrder = new PreOrder();
        preOrder.treverse(root);

        System.out.println(separator);
        TreeTraversal postOrder = new PostOrder();
        postOrder.treverse(root);

        System.out.println(separator);
        TreeTraversal levelOrder = new levelOrderTraversal();
        levelOrder.treverse(root);

        System.out.println(separator);
        TreeTraversal preOrderIterative = new PreOrderIterative();
        preOrderIterative.treverse(root);
    }
}