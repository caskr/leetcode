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
     * @param root TreeNode类 the root
     * @return bool布尔型一维数组
     */
    
    public boolean[] judgeIt (TreeNode root) {
        // write code here
        return new boolean[]{isBTS(root,null,null),isCBT(root)};
    }
    public boolean isBTS (TreeNode root,TreeNode min,TreeNode max) {
        if(root == null)    return true;
        if(min != null && root.val < min.val)    return false;
        if(max != null && root.val > max.val)    return false;
        return (isBTS(root.left,min,root)&&isBTS(root.right,root,max));
    }
    public boolean isCBT (TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        if(root == null)    return true;
        queue.addLast(root);
        boolean flag = false;
        while(!queue.isEmpty()){
            TreeNode first = queue.getFirst();
            if(!flag && first.left != null)
                queue.addLast(first.left);
            else if(flag && first.left != null)
                return false;
            else
                flag = true;
            if(!flag && first.right != null)
                queue.addLast(first.right);
            else if(flag && first.right!= null)
                return false;
            else 
                flag = true;
            queue.removeFirst();
        }
        return true;
    }
}