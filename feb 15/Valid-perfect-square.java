PROBLEM LINK: https://leetcode.com/problems/valid-perfect-square/description/


class Solution {
    public boolean isPerfectSquare(int num) {

        double x=Math.sqrt(num);
        if(x==(int)x)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
