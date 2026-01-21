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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ls=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root!=null){
            q.add(root);
            while(!q.isEmpty()){
                List<Integer> ls2=new ArrayList<Integer>();
                int ln=q.size();
                for(int j=0; j<ln; j++){
                    root=q.remove();
                    ls2.add(root.val);
                    if(root.left!=null)
                        q.add(root.left);
                    if(root.right!=null)
                        q.add(root.right);
                }
                ls.add(ls2);
            }
        }
        return ls;
    }
}