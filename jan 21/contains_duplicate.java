QUESTION LINK: https://leetcode.com/problems/contains-duplicate/description/

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        if(nums.length<=1)
        {
            return false;
        }
       
        for(int i=0;i<nums.length-1;i++)
        {
             
            if(nums[i]==nums[i+1])
            {
                return true;

            }
        }
            return false;
        
    }
}
