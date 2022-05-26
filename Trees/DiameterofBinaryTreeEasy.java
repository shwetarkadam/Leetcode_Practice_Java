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
//calculate height in help and keep track of max height using ans
class Solution {
    int ans =0;
    public int diameterOfBinaryTree(TreeNode root) {
         help(root);
        return ans;
        
    }
    public int help(TreeNode root){
        if(root==null)
            return 0;
        
        int l=help(root.left);
        int r=help(root.right);
        ans=Math.max(l+r,ans);
        return Math.max(l,r)+1;
    }
}
