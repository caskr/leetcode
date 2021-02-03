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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    TreeNode dfs(int[] pre, int[] in, int pl, int pr, int il, int ir) {
        if(pr < pl) return null;
        TreeNode now = new TreeNode(pre[pl]);
        int root = 0;
        for(int i = il; i <= ir; i++){
            if(in[i] == pre[pl]){
                root = i;
                break;
            }
        }
        now.left = dfs(pre,in,pl+1,pl+root-il,il,root-1);
        now.right = dfs(pre,in,pl+root-il+1,pr,root+1,ir);
        return now;
    }
}