class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums){
            if(num % 2 == 0)
                set.add(num);
            else
                set.add(num*2);
        }
        int res = set.last() - set.first();
        while(res > 0 && set.last()%2 == 0){
            int temp = set.last();
            set.remove(temp);
            set.add(temp/2);
            res = Math.min(res,set.last()-set.first());
        }
        return res;
    }
}