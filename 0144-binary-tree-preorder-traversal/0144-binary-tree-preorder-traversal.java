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
    void display(List<Integer> ls, TreeNode root){
        if(root==null)
            return;
        ls.add(root.val);
        display(ls, root.left);
        display(ls, root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<Integer>();
        display(ls, root);
        return ls;
    }
}