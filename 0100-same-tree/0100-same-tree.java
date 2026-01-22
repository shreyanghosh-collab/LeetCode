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
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p==null || q==null)
//             return false;
//         else{
//             if(p.val!=q.val)
//                 return false;
//             else{
//                 if(p==null && q==null)
//                     return true;
//                 else if(p==null && q!=null)
//                     return false;
//                 else if(p!=null && q==null)
//                     return false;
//                 isSameTree(p.left, q.left);
//                 isSameTree(p.right, q.right);
//             }
//             return true;
//         }
//     }
// }
class TreeMismatchException extends RuntimeException {}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        try {
            return checkSame(p, q);
        } catch (TreeMismatchException e) {
            // Once the condition fails anywhere, the stack is emptied to here
            return false;
        }
    }

    private boolean checkSame(TreeNode p, TreeNode q) {
        // Your logic applied with "Hard Breaks"
        if (p == null && q == null) return true;
        
        if (p == null || q == null) {
            throw new TreeMismatchException(); // Break everything
        }
        
        if (p.val != q.val) {
            throw new TreeMismatchException(); // Break everything
        }

        // Recursive calls
        checkSame(p.left, q.left);
        checkSame(p.right, q.right);

        return true; 
    }
}