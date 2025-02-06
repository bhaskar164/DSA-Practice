package BinaryTreeDS;

import java.util.Stack;

public class PreOrderIterative implements TreeTraversal{
    @Override
    public void treverse(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            System.out.print(stack.peek().val + " ,");
            TreeNode currNode = stack.pop();
            if (currNode.left!=null) stack.push(currNode.left);
            if (currNode.right!=null) stack.push(currNode.right);
        }
    }
}
