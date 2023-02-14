PROBLEM LINK: https://leetcode.com/problems/maximum-gap/description/


class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int d=0;
        int s=0;
        if(nums.length<2)
        {
            return 0;
        }
        for(int i=0;i<nums.length-1;i++)
        {
                d=nums[i+1]-nums[i];


                if(d>s)
                {
                    s=d;
                }
        }
            return s;
    }
}
