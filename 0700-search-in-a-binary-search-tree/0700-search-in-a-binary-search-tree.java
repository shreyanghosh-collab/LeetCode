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
    public TreeNode searchBST(TreeNode root, int val) {
        if(val==root.val)
            return root;
        else if(val<root.val && root.left!=null)
            return searchBST(root.left, val);
        else if(val>=root.val && root.right!=null)
            return searchBST(root.right, val);
        else
            return null;
    }
}