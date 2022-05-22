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
    boolean res=true;
    public boolean isBalanced(TreeNode root) {
        help(root);
        return res;
    }
public int  help(TreeNode root){
        if(root==null)
            return 0;
    
    
    int lh=help(root.left);
    int rh=help(root.right);
    int diff=Math.abs(rh-lh);
    if(diff>1)res=false;
    
    
    return Math.max(lh,rh)+1;
    }
}
