PROBLEM LINK: https://leetcode.com/problems/first-missing-positive/description/


class Solution {
    public int firstMissingPositive(int[] nums) {
        int c=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==c)
            {
                c++;
            }


        }
        

        return c;
    }
}
