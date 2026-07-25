class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int i=0;
        int j=height.length-1;
        while(i < j){
            int width = j - i;
            int heigh = Math.min(height[i] , height[j]);
            int area=width * heigh;
            maxarea=Math.max(area,maxarea);
        if(height[i] < height[j]){
            i++;
        }else{
            j--;
        }
    }
        return maxarea;
    }
}