import java.util.*;


public class Solution {
    /**
     * longest common substring
     * @param str1 string字符串 the string
     * @param str2 string字符串 the string
     * @return string字符串
     */
    public String LCS (String str1, String str2) {
        // write code here
        if(str1.length()==0 || str2.length()==0)
            return "-1";
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1+1][len2+1];
        int max = 0;
        int end = 0;
        for(int i=0; i<=len1; i++) dp[i][0] = 0;
        for(int j=0; j<=len2; j++) dp[0][j] = 0;
        for(int i=1; i<=len1; i++){
            for(int j=1; j<=len2; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)) 
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=0;
                if(dp[i][j]>max){
                    max = dp[i][j];
                    end = j;
                }
            }
        }
        if(max == 0)return "-1";
        return str2.substring(end-max,end);
    }
}