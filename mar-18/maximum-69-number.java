problem link:https://leetcode.com/problems/maximum-69-number/description/

class Solution {
    public int maximum69Number (int num) {
        char[] s = Integer.toString(num).toCharArray();
        for(int i = 0; i < s.length; i++) {
            if(s[i] == '6') {
                s[i] = '9';
                break;
            }
        }
        return Integer.valueOf(new String(s));
    }
}
