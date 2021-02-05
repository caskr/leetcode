import java.util.*;
class Solution{
    /*递归 时间不达标
	public static int dnaJudge(String a,String b){
        int al = a.length();
        int bl = b.length();
        if(0 == al){
            return bl;
        }
        else if(0 == bl){
            return al;
        }
        else if(a.equals(b)){
            return 0;
        }
        
        int d;
        if(a.charAt(al-1)==b.charAt(bl-1))
            d = 0;
        else
            d = 1;

        return Min(dnaJudge(a,b.substring(0,bl-1))+1,
                    dnaJudge(a.substring(0,al-1),b)+1,
                    dnaJudge(a.substring(0,al-1),b.substring(0,bl-1))+d);
    }*/
    public static int Min(int a,int b,int c){
        return a<b? (c<a?c:a):(c<b?c:b);
    }
    public static int dnaJudge(String a,String b){
        int al = a.length();
        int bl = b.length();
        if(0 == al) return bl;
        else if(0 == bl) return al;
        else if(a.equals(b)) return 0;
        int[][] dp = new int[al+1][bl+1];
        dp[0][0] = 0;
        for(int i=1; i<al+1; i++)
            dp[i][0] = i;
        for(int i=1; i<bl+1; i++)
            dp[0][i] = i;
        for(int i=1; i<al+1; i++){
            for(int j=1; j<bl+1; j++){
                if(a.charAt(i-1)==b.charAt(j-1))
                    dp[i][j] = Min(dp[i-1][j-1],dp[i-1][j]+1,dp[i][j-1]+1);
                else
                    dp[i][j] = Min(dp[i-1][j-1]+1,dp[i-1][j]+1,dp[i][j-1]+1);
            }
        }
        return dp[al][bl];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input ="";
        if (scan.hasNext()){
            input = scan.nextLine();
        }
        scan.close();
        String[] array = input.split(",");
        System.out.println(dnaJudge(array[0], array[1]));
    }
}