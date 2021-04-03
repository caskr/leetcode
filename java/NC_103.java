import java.util.*;


public class Solution {
    /**
     * 反转字符串
     * @param str string字符串 
     * @return string字符串
     */
    public String solve (String str) {
        // write code here
        char[] array = str.toCharArray();
        int n = str.length();
        for(int i=0; i<=n/2-1; i++) {
            char temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }
        return new String(array);
    }
}