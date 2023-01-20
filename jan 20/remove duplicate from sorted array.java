question link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {



        int n = nums.length, count = 0;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                count++;
            }
            else
                nums[i + 1 - count] = nums[i + 1];
        }
        return n - count;

        
    }
}
