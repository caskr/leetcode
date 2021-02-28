class Solution {
    public int minimumBoxes(int n) {
        int sum = 0;
        int k = 0;
        while(n >= sum){
            k++;
            sum += k*(k+1)/2;
        }
        int res = k*(k-1)/2;
        n -= sum - k*(k+1)/2;
        k = 1;
        while(n > 0){
            n -= k;
            k++;
            res++;
        }
        return res;
    }
}