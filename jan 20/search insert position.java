// QUESTION LINK : https://leetcode.com/problems/search-insert-position/description/


class Solution {
    public int searchInsert(int[] nums, int target) {
        

               int k = 0, l = 0, h = nums.length - 1;
    while (l <= h) {
        int mid = l + (h - l) / 2;

        if (target > nums[mid]) {
            l = mid + 1;
            k = mid + 1;
        } else if (target < nums[mid]) {
            h = mid - 1;
            k = mid;
        } else {
            k = mid;
            break;
        }
    }
    return k;

        
    }
}
