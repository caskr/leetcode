public class Solution {
    public int Fibonacci(int n) {
        if(n == 0 || n ==1)    return n;
//         return(Fibonacci(n-1)+Fibonacci(n-2));
        int f0 = 0;
        int f1 = 1;
        int res = 0;
        for(int i = 2; i<=n; i++){
            res = f0+f1;
            f0 = f1;
            f1 = res;
        }
        return res;
    }
}