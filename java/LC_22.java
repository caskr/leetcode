class Solution {
    List<String> list = new ArrayList<>();
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        recursive("",0,0);
        return list;
    }
    public void recursive(String str,int left,int right){
        if(left > n || right > n || left < right)
            return;
        if(left == n && right == n){
            list.add(str);
            return;
        }
        recursive(str+'(',left+1,right);
        recursive(str+')',left,right+1);
    }
}