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
    
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null)    return new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> bro = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current = queue.getFirst();
                bro.add(current.val);
                if(current.left!=null)
                    queue.addLast(current.left);
                if(current.right!=null)
                    queue.addLast(current.right);
                queue.removeFirst();
            }
            res.add(bro);
        }
        return res;
    }
}