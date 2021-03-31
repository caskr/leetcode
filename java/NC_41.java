import java.util.*;


public class Solution {
    /**
     * 
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        // write code here
        HashMap<Integer,Integer> hash = new HashMap<>();
        int max = 0;
        int len = 0;
        for(int i=0; i<arr.length; i++){
            if(hash.containsKey(arr[i]) && (hash.get(arr[i])>=i-len)){
                max = Math.max(max,len);
                len = i - hash.get(arr[i]);
            }
            else{
                len++;
            }
            hash.put(arr[i],i);
        }
        max = Math.max(max,len);
        return max;
    }
}