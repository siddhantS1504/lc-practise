PROBLEM LINK:https://leetcode.com/problems/maximum-product-of-three-numbers/description/


class Solution {
    public int maximumProduct(int[] nums) {
       
        int n=nums.length;
      
       
        Arrays.sort(nums);
        // return nums[n-2]*nums[n-1]* nums[n-3];
        return Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);
        
    }
}
