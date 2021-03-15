import java.util.*;


public class Solution {
    /**
     * 
     * @param numbers int整型一维数组 
     * @param target int整型 
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int cur = numbers[i];
            if(hash.containsKey(target-cur))
                return new int[]{hash.get(target-cur)+1,i+1};
            hash.put(cur,i);
        }
        return new int[]{};
    }
}