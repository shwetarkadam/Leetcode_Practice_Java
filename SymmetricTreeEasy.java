/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean isSymmetric(TreeNode root) {
       if(root==null)
           return false;
        return check(root.left,root.right);
}
    public boolean check(TreeNode l,TreeNode r){
        
        if(l==null && r==null)     //check left andf right
            return true;
        if(l==null || r==null)     //even if one is null return false
            return false;
        
        if(l.val!=r.val)     //first check value
            return false;
       if(!check(l.left,r.right))      //checl elft and right all false conditions whatver left is true
           return false;
        
          if(!check(l.right,r.left)) 
           return false;
        
        return true;

        
        
    }
}
