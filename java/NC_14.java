import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param root TreeNode类 
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null)    return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        int bro_sum = 1;
        boolean reverse = false;
        while(!queue.isEmpty()){
            ArrayList<Integer> bro = new ArrayList<>();
            int n = bro_sum;
            bro_sum = 0;
            for(int i=0;i<n;i++) {
                TreeNode cur = queue.removeFirst();
                if(reverse)
                    bro.add(0,cur.val);
                else
                    bro.add(cur.val);
                if(cur.left!=null){
                    queue.addLast(cur.left);
                    bro_sum++;
                }
                if(cur.right!=null){
                    queue.addLast(cur.right);
                    bro_sum++;
                }
            }
            reverse = reverse?false:true;
            res.add(bro);
        }
        return res;
    }
}