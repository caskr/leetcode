class Solution {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int total = 0;
        int res = 1;
        for(;right <= nums.length-1; right++) {
            total += (nums[right]-nums[right-1])*(right-left);
            while(total > k) {
                total -= nums[right] - nums[left];
                left++;
            }
            res = Math.max(res,right-left+1);
            if(res > nums.length-left)
                break;
        }
        return res;
    }
//        Arrays.sort(nums);
//        int n = nums.length;
//        int copy_k = k;
//        int count = 1;
//        int max = 1;
//        for(int i=n-1; i>=0; i--) {
//            count = 1;
//            copy_k = k;
//            for(int j=i-1; j>=0; j--) {
//                if(nums[i]-nums[j]<=copy_k){
//                    copy_k -= nums[i]-nums[j];
//                    count++;
//                } else{
//                    break;
//                }
//            }
//            max = Math.max(count,max);
//            if(max >= i)
//                break;
//        }
//        return max;
//    }
}