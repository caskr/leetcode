public class Solution {
    public int JumpFloor(int target) {
//         //递归 时间复杂度高
//         if(target == 0)    return 0;
//         if(target == 1)    return 1;
//         if(target == 2)    return 2;
//         return JumpFloor(target-1)+JumpFloor(target-2);

        if(target <= 2)    return target;
        int f1 = 1,f2 = 2;
        int res = f1+f2;
        for(int i=3; i<=target; i++){
            res = f1+f2;
            f1 = f2;
            f2 = res;
        }
        return res;
    }
}