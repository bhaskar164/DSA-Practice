package BinaryTreeDS.Services;

import BinaryTreeDS.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class GenerateTreeService {
/*
*            1
*       2          3
*   4       5
* 7
* */

    public static TreeNode createTree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(7);
        return root;
    }
}



