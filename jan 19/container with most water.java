// PROBLEM LINK :https://leetcode.com/problems/container-with-most-water/description/




class Solution {
    public int maxArea(int[] height) {
        
        int area=0;
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while(l < r){
            int w = r - l;
            int h = Math.min(height[l], height[r]);
            area = h * w;
            max = Math.max(max, area);
            if(height[l] < height[r]) l++;
            else if(height[l] > height[r]) r--;
            else {
                l++;
                r--;
            }
        }
        return max;
    }
}
