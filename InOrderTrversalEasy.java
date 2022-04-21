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
    public List<Integer> inorderTraversal(TreeNode root) {
        return traverse(new ArrayList<Integer>(),root);
    }
    public List<Integer> traverse(List<Integer> l,TreeNode root){
        if(root==null)
            return l;
        
      
        traverse(l,root.left);
          l.add(root.val);
        traverse(l,root.right);
        return l;
    }
}
