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
    public int sumNumbers (TreeNode root) {
        // write code here
        return dfs(root,0);
    }
    public int dfs (TreeNode root, int sum) {
        if(root == null)    return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null)
            return sum;
        return dfs(root.left,sum)+dfs(root.right,sum);
    }
}