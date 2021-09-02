import java.util.ArrayList;
import java.util.*;

public class Solution {
	
	//快排思想法
	
//    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//         ArrayList<Integer> res = new ArrayList<>();
//         if(k == 0 || k > input.length)
//             return res;
//         quickSort(input, 0, input.length-1, k);
//         for(int i=0; i<k; i++) {
//             res.add(input[i]);
//         }
//         return res;
//     }
//     public void quickSort(int[] arr, int start, int end, int k) {
//         int l = start;
//         int r = end;
//         while(l < r) {
//             while (l < r && arr[r] > arr[start])
//                 r--;
//             while(l < r && arr[l] <= arr[start])
//                 l++;
//             swap(arr, l, r);
//         }
//         swap(arr, start, l);
//         if(l+1 == k) return;
//         else if(l+1 > k) quickSort(arr, start, l-1, k);
//         else if(l+1 < k) quickSort(arr, l+1, end, k);
//     }
//     public void swap (int[] arr, int l, int r) {
//         int temp = arr[l];
//         arr[l] = arr[r];
//         arr[r] = temp;
//     }


    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        //自带函数法
//         ArrayList<Integer> res = new ArrayList<>();
//         if(k > input.length)
//             return res;
//         Arrays.sort(input);
//         for(int i=0; i<k; i++){
//             res.add(input[i]);
//         }
//         return res;
        
		//优先队列法
		ArrayList<Integer> res = new ArrayList<>();
        if(k == 0 || k > input.length)
            return res;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });
        for(int i=0; i<k; i++) {
            queue.offer(input[i]);
        }
        for(int i=k; i<input.length; i++) {
            if(input[i] < queue.peek()) {
                queue.poll();
                queue.offer(input[i]);
            }
        }
        for(int i=0; i<k; i++) {
            res.add(queue.poll());
        }
        return res;
		
		//按顺序维护数组法
//	       ArrayList<Integer> res = new ArrayList<>();
//         if(k > input.length || k <= 0)    return res;
//         for(int i=1; i<k; i++){
//             int unsort = input[i];
//             int j = i-1;
//             while(j>=0){
//                 if(unsort < input[j])
//                     input[j+1] = input[j];
//                 else
//                     break;
//                 j--;
//             }
//             input[j+1] = unsort;
//         }
//         for(int i=k; i<input.length; i++){
//             int unsort = input[i];
//             if(unsort>=input[k-1])
//                 continue;
//             else{
//                 int j = i-1;
//                 while(j >= 0){
//                     if(unsort < input[j])
//                         input[j+1] = input[j];
//                     else
//                         break;
//                     j--;
//                 }
//                 input[j+1] = unsort;
//             }
//         }
//         for(int i=0; i<k; i++){
//             res.add(input[i]);
//         }
//         return res;
    }
}