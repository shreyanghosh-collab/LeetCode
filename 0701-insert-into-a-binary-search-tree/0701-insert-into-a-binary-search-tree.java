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
    void traversal(TreeNode root, int x){
        if(x<root.val){
            if(root.left!=null)
                traversal(root.left, x);
            else
                root.left=new TreeNode(x);
        }
        else if(x>root.val){
            if(root.right!=null)
                traversal(root.right, x);
            else
                root.right=new TreeNode(x);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int a){
        if(root==null)
            root=new TreeNode(a);
        else
            traversal(root, a);
        return root;
    }
}