QUESTION LINK:  https://leetcode.com/problems/length-of-last-word/description/


class Solution {
    public int lengthOfLastWord(String s) {
        
        int i;
        for(i=s.length()-1;i>0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                    break;
            }
        }
            int b=s.substring(0,i).lastIndexOf(" ");
            return i-b;
    }
}
