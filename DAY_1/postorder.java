import java.util.* ;
import java.io.*; 
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> res=new ArrayList<>();
        Solution obj=new Solution();
        obj.helper(root,res);
        return res;
    }
    public void helper(TreeNode root,List<Integer> res)
    {
        //lrv :left right visit 
        if(root!=null)
        {
            helper(root.left,res);
            helper(root.right,res);
            res.add(root.data);

        }
    }
}
