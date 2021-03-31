import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public String solve (String s, String t) {
        // write code here
        StringBuilder res = new StringBuilder();
        int s_num = s.length()-1;
        int t_num = t.length()-1;
        int carry = 0;//进位
        int sum = 0;
        while(s_num>=0||t_num>=0){
            sum = carry;
            sum = (s_num >= 0)? sum +(s.charAt(s_num--)-'0'):sum;
            sum = (t_num >= 0)? sum +(t.charAt(t_num--)-'0'):sum;
            carry = (sum>=10)?1:0;
            res.append(sum%10);
        }
        if(carry==1)
            res.append(carry);
        return reverse(res.toString());
    }
    public String reverse(String a){
        StringBuilder res = new StringBuilder();
        for(int i=a.length()-1; i>=0; i--){
            res.append(a.charAt(i));
        }
        return res.toString();
    }
}