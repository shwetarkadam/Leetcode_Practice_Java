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
    public TreeNode insertIntoBST(TreeNode root, int val) {
       if(root==null)return new TreeNode(val);
        TreeNode currentNode=root;
        while(true){
            
           if(currentNode.val>val){                           
               if(currentNode.left!=null){
                   currentNode=currentNode.left;    //if current node .left has a value then switch to that node as current and go deep down in the tree
               }else{
                  currentNode.left=new TreeNode(val);    //break the loop when finally new node is made
                   break;
               }
               
           }else{
              if(currentNode.right!=null){
                   currentNode=currentNode.right;
               }else{
                  currentNode.right=new TreeNode(val); 
                   break;
               } 
           }
        }
        return root;
}
}
