QUESTION LINK:https://leetcode.com/problems/third-maximum-number/description/

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int flag=0;
        int n=nums.length;
        for(int i=n-1;i>0;i--)
        {
                if(nums[i]==nums[i-1])
                {
                    flag=flag+1;
                }
                else
                {
                    count=count+1;
                }
                if(count==3)
                {
                    return nums[n-count-flag];
                }
        }
        return nums[n-1];
    }
}
