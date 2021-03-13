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
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    /*
    先序、中序、后序分别一个函数，麻烦
    private List<Integer> first = new ArrayList<>();
    private List<Integer> mid = new ArrayList<>();
    private List<Integer> last = new ArrayList<>();
    public int[][] threeOrders (TreeNode root) {
        // write code here
        if(root == null)    return null;
        firstOrder(root);
        midOrder(root);
        lastOrder(root);
        int[][] res = new int[3][first.size()];
        for(int i=0; i<first.size(); i++){
            res[0][i] = first.get(i);
            res[1][i] = mid.get(i);
            res[2][i] = last.get(i);
        }
        return res;
    }
    public void firstOrder(TreeNode root) {
        if(root == null)    
            return;
        first.add(root.val);
        if(root.left != null)
            firstOrder(root.left);
        if(root.right != null)
            firstOrder(root.right);
    }
    public void midOrder(TreeNode root) {
        if(root == null)    
            return;
        if(root.left != null)
            midOrder(root.left);
        mid.add(root.val);
        if(root.right != null)
            midOrder(root.right);
    }
    public void lastOrder(TreeNode root) {
        if(root == null)    
            return;
        if(root.left != null)
            lastOrder(root.left);
        if(root.right != null)
            lastOrder(root.right);
        last.add(root.val);
    }
    */
    int[][] res;
    int first=0,mid=0,last=0;
    public int[][] threeOrders (TreeNode root) {
        this.res = new int[3][getSize(root)];
        order(root);
        return res;
    }
    public int getSize(TreeNode root){
        if(root == null)    return 0;
        return 1+getSize(root.left)+getSize(root.right);
    }
    public void order(TreeNode root){
        if(root == null)    return;
        res[0][first++] = root.val;
        order(root.left);
        res[1][mid++] = root.val;
        order(root.right);
        res[2][last++] = root.val;
        return;
    }
}