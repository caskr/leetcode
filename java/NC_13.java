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
     * @return int整型
     */
    public int maxDepth (TreeNode root) {
        // write code here
        if(root==null)    return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1+(left>right?left:right);
    }
}