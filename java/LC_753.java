class Solution {
    Set<Integer> visited = new HashSet<Integer>();
    StringBuffer ans = new StringBuffer();
    int highest;
    int k;
    public String crackSafe(int n, int k) {
        this.k = k;
        highest = (int) Math.pow(10,n-1);
        dfs(0);
        for(int i = 1; i < n; i++)
            ans.append(0);
        return ans.toString();
    }
    public void dfs(int now){
        for(int i = k-1; i >= 0; i--){
            int temp = now*10 + i;
            if(!visited.contains(temp)){
                visited.add(temp);
                dfs(temp%highest);
                ans.append(i);
            }
        }
    }
}