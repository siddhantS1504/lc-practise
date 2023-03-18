PROBLEM LINK: https://leetcode.com/problems/split-a-string-in-balanced-strings/description/

class Solution {
    public int balancedStringSplit(String s) {
        int c = 0;
        int ch = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                ch++;
            }
            else {
                ch--;
            }
            if (ch== 0) {
                c++;
            }

        }
        return c;
    }
}

