class Solution {
    public int maxArea(int[] height) {
       int start=0,end=height.length-1,a,min,max,maxarea=Integer.MIN_VALUE;
        while(start<end){
        min=Math.min(height[start],height[end]);
        max=Math.max(height[start],height[end]);
        a=(end-start)*min;
        maxarea=Math.max(maxarea,a);
        if(height[start]<height[end]){
            ++start;
        }
        else
        --end;
        }
        return maxarea;
    }
}
