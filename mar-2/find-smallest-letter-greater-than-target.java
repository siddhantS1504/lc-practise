https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        char r=letters[0];
        for(int i=0;i<letters.length;i++)
        {
            if((int)(target)<(int)(letters[i]))
            {
                return letters[i];
            }
        }
            return r;
    }
}
