import java.util.ArrayList;
import java.util.*;

public class Solution {
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
        ArrayList<Integer> res = new ArrayList<>();
        if(k > input.length || k <= 0)    return res;
        for(int i=1; i<k; i++){
            int unsort = input[i];
            int j = i-1;
            while(j>=0){
                if(unsort < input[j])
                    input[j+1] = input[j];
                else
                    break;
                j--;
            }
            input[j+1] = unsort;
        }
        for(int i=k; i<input.length; i++){
            int unsort = input[i];
            if(unsort>=input[k-1])
                continue;
            else{
                int j = i-1;
                while(j >= 0){
                    if(unsort < input[j])
                        input[j+1] = input[j];
                    else
                        break;
                    j--;
                }
                input[j+1] = unsort;
            }
        }
        for(int i=0; i<k; i++){
            res.add(input[i]);
        }
        return res;
    }
}