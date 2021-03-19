import java.util.*;


public class Solution {
    /**
     * find median in two sorted array
     * @param arr1 int整型一维数组 the array1
     * @param arr2 int整型一维数组 the array2
     * @return int整型
     */
    public int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {
        // write code here
        if(arr1.length==0 || arr2.length == 0||arr1.length != arr2.length)
            return -1;
        return BS(arr1,arr2,0,arr1.length-1,0,arr2.length-1);
    }
    public int BS(int[]arr1,int[]arr2,int l1,int r1,int l2,int r2){
        if(l1 >= r1)    
            return Math.min(arr1[l1],arr2[l2]);
        int mid1 = (l1+r1)/2;
        int mid2 = (l2+r2)/2;
        int offset = (r1-l1)%2;
        if(arr1[mid1] < arr2[mid2]){
            return BS(arr1,arr2,mid1+offset,r1,l2,mid2);
        }else if(arr1[mid1] > arr2[mid2]){
            return BS(arr1,arr2,l1,mid1,mid2+offset,r2);
        }else{
            return arr1[mid1];
        }
    }
}