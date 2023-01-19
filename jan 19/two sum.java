question link :https://leetcode.com/problems/container-with-most-water/description/


class Solution {
    public int maxArea(int[] height) {
        int c=0;
        int area=0;
        for(int i=0;i<height.length-1;i++)
        {
            
            
            for(int j=i+1;j<height.length;j++)
            {
                
                
                if(area<Math.min(height[i],height[j])*(j-i))
            {
                area=Math.min(height[i],height[j])*(j-i);
            }
                
            }
             
            

        }
        return area;
        
    }
}
