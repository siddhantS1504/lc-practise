PROBLEM LINK: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans = {-1,-1};
        for(int i = 0; i < nums.length; i++){
           if(nums[i] == target){
               ans[0] = i;
                while(i<nums.length && nums[i] == target){
                    ans[1] = i;
                    i++;
                    
               } 
               break;
           }
        }
        return ans;
    }
}
