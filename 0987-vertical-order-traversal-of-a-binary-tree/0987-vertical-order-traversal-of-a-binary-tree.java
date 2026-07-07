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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Map<Integer,Map<Integer,List<Integer>>> mp=new TreeMap<>();
        Queue<Object[]> q=new LinkedList<>();
        q.offer(new Object[]{root,0,0});
        while(!q.isEmpty()){
            Object[] arr=q.poll();
            TreeNode node=(TreeNode)arr[0];
            int row=(int)arr[1];
            int col=(int)arr[2];
            mp.putIfAbsent(col,new TreeMap<>());
            mp.get(col).putIfAbsent(row,new ArrayList<>());
            mp.get(col).get(row).add(node.val);
            if(node.left!=null){
                q.offer(new Object[]{node.left,row+1,col-1});
            }
            if(node.right!=null){
                q.offer(new Object[]{node.right,row+1,col+1});
            }
        }
        for(Map<Integer,List<Integer>> row :mp.values()){
            List<Integer> temp=new ArrayList<>();
            for(List<Integer> list:row.values()){
                Collections.sort(list);
                temp.addAll(list);
            }
            ans.add(temp);
        }
        return ans;
    }
}