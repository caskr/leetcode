import java.util.*;

public class Solution {
    public int findKth(int[] a, int n, int K) {
        // write code here
        return findK(a,0,n-1,K);
    }
    public int findK(int[] a, int l, int r, int k){
        if(l > r) return -1;
        int index = getIndex(a,l,r);
        if(index == k-1)    return a[index];
        else if(index < k-1)
            return findK(a,index+1,r,k);
        else
            return findK(a,l,index-1,k);
    }
    public int getIndex(int[] a, int l, int r){
        int i=l, j=r;
        int standard = a[l];
        while(i < j){
            while(i<j && a[j]<=standard) j--;
            if(i < j)
                a[i++] = a[j];
            while(i<j && a[i]>= standard) i++;
            if(i < j)
                a[j--] = a[i];
        }
        a[i] = standard;
        return i;
    }
}