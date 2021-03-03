class Solution {
    int min = 0;
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        if(price.size()==0) return 0;
        for(int i=0;i<price.size();i++){
            min += price.get(i)*needs.get(i);//单个购买价钱
        }
        dfs(price,special,needs,0,min);
        return min;
    }
    public void dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int s_index, int money){
        if(s_index >= special.size())   return;

        boolean flag = true;
        List<Integer> newneeds = new ArrayList<>();
        int temp = 0;
        for(int i=0; i<price.size(); i++){
            if(special.get(s_index).get(i) > needs.get(i)){
                flag = false;
                break;
            }
            temp += price.get(i) * special.get(s_index).get(i);
            newneeds.add(needs.get(i)-special.get(s_index).get(i));
        }
        if(flag){
            int newmoney = money - temp + special.get(s_index).get(price.size());
            min = Math.min(newmoney,min);
            dfs(price,special,newneeds,s_index,newmoney);
        }
        dfs(price,special,needs,s_index+1,money);
    }
}