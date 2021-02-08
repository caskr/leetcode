class Solution{
    public int maximalRectangle(char[][] matrix){
        if(0 == matrix.length)
            return 0;
        int smax = 0;
        int[] height = new int[matrix[0].length];
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length; j++){
                height[j] = (matrix[i][j] == '0')? 0:(height[j]+1);
            }
            smax = Math.max(smax,largest(height));
        }
        return smax;
    }
    private int largest(int[] height){
        if(height.length == 0)  return 0;
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int smax = 0;
        for(int i=0; i<height.length; i++){
            while(s.peek()!=-1 && height[s.peek()]>height[i]){
                int top = s.pop();
                smax = Math.max(smax,height[top]*(i-s.peek()-1));
            }
            s.push(i);
        }
        while(s.peek()!=-1){
            smax = Math.max(smax,height[s.pop()]*(height.length-s.peek()-1));
        }
        return smax;
    }
    /*private int largest(int[] height){
        if(height.length == 0)  return 0;
        int smax = 0;
        for(int i=0; i<height.length; i++){
            int l = i-1;
            int r = i+1;
            while(l>=0 && height[l]>=height[i])
                l--;
            while(r<height.length && height[r]>=height[i])
                r++;
            smax = Math.max(smax,(r-l-1)*height[i]);//r-l-1 = (r-l+1)-2
        }
        return smax;
    }*/
}
