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
    public List<Integer> preorderTraversal(TreeNode root) {
        return traverse(new ArrayList<Integer>(),root);
    }
    public List<Integer> traverse(List<Integer> l,TreeNode root){
        if(root==null)
            return l;  //base cond where smallest input we return list with whatever values we have
        
        l.add(root.val);
        traverse(l,root.left);
        traverse(l,root.right);
        return l;
    }
}
