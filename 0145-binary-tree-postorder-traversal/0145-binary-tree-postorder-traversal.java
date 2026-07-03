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
    public void traverse(TreeNode node,List<Integer> a){
        if(node==null){
            return ;
        }
        traverse(node.left,a);
        traverse(node.right,a);
        a.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        traverse(root,a);
        return a;
    }
}