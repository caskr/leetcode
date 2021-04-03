import java.util.*;
public class Solution {
    ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0)    return res;
        outsideOrder(matrix,0,0,matrix[0].length-1,matrix.length-1);
        return res;
    }
    public void outsideOrder (int[][]matrix,int left,int top,int right,int bottom){
        if(top > bottom || left > right) return;
        for(int i=left; i<=right; i++){
            res.add(matrix[top][i]);
        }
        if(top+1>bottom)    return;
        for(int i=top+1; i<=bottom; i++){
            res.add(matrix[i][right]);
        }
        if(right-1<left)    return;
        for(int i=right-1; i>=left; i--){
            res.add(matrix[bottom][i]);
        }
        if(bottom-1<top+1)    return;
        for(int i=bottom-1; i>=top+1;i--){
            res.add(matrix[i][left]);
        }
        outsideOrder(matrix,left+1,top+1,right-1,bottom-1);
        return;
    }
}