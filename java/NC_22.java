public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int a_index = m-1;
        int b_index = n-1;
        int index = m+n-1;
        while(a_index >=0 && b_index >=0 && index >=0){
            A[index--] = (A[a_index]>B[b_index])?A[a_index--]:B[b_index--];
        }
        while(a_index>=0 && index >=0){
            A[index--] = A[a_index--];
        }
        while(b_index>=0 && index >=0){
            A[index--] = B[b_index--];
        }
        return;
    }
}