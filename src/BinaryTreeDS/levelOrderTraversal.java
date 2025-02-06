package BinaryTreeDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal implements TreeTraversal{

    @Override
    public void treverse(TreeNode node) {
        List<List<Integer>> ansList = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            List<Integer> subList = new ArrayList<>();
            int level = queue.size();                       //determines the number of nodes in the level = que.size
            for(int i = 0 ; i < level; i++){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.add(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            ansList.add(subList);
        }
        System.out.println(ansList);
    }
}


