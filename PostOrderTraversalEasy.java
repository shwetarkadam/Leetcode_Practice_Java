class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
     return traverse(new ArrayList<Integer>(),root);
    }
    public List<Integer> traverse(List<Integer> l,TreeNode root){
        if(root==null)
            return l;
        
        traverse(l,root.left);
        traverse(l,root.right);
          l.add(root.val);
        return l;
    }
}
