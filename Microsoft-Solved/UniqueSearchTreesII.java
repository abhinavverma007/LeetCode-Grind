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
    public List<TreeNode> generateTrees(int n) {
        return helper(1,n);
        
    }
    public List<TreeNode> helper(int start,int end){
         List<TreeNode> list=new ArrayList<>();
        if(start>end){
            list.add(null);
            return list;
        }
       
        for(int rootval=start; rootval<=end; rootval++){
          //  System.out.println(rootval+" "+start+" "+end);
            List<TreeNode> leftTrees=helper(start,rootval-1);
            // System.out.println("L:"+rootval+" "+start+" "+end);
            List<TreeNode> rightTrees=helper(rootval+1,end);
            // System.out.println("R:"+rootval+" "+start+" "+end);
            for(TreeNode l: leftTrees){
                for(TreeNode r: rightTrees){
                    TreeNode root=new TreeNode(rootval,l,r);
                    list.add(root);
                }
            }
        }
        return list;
    }
}