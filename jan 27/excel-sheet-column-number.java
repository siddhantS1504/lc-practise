PROBLEM LINK: https://leetcode.com/problems/excel-sheet-column-number/description/

class Solution {
    public int titleToNumber(String columnTitle) {
        String s=columnTitle;
        if (s == null) return -1;
        int sum = 0;
        // for each loop so we don't need to mess with index values.
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
        
    }
}
