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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root=new TreeNode();
        if(root1!=null ||root2!=null){
            int x=root1!=null?root1.val:0;
            int y=root2!=null?root2.val:0;
            
            root.val=x+y;
        }else
            return null; //need this solve stackoverflow error

        
        root.left=mergeTrees((root1!= null) ?root1.left:root1,(root2!=null)?root2.left:root2);
        root.right=mergeTrees((root1!= null) ?root1.right:root1,(root2!=null)?root2.right:root2);
        
        return root;
    }
}
