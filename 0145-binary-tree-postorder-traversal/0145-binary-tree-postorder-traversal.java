class Solution {
    void display(List<Integer> ls, TreeNode root){
        if(root==null)
            return;
        display(ls, root.left);
        display(ls, root.right);
        ls.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<Integer>();
        display(ls, root);
        return ls;
    }
}