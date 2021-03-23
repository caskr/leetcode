import java.util.*;


public class Solution {
    /**
     * max sum of the subarray
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxsumofSubarray (int[] arr) {
        // write code here
        int sum = 0, max = 0;
        for(int i=0; i<arr.length;i++){
            int temp = sum + arr[i];
            if(temp > 0)
                sum = temp;
            else
                sum = 0;
            max = Math.max(max,sum);
        }
        return max;
    }
}