QUESTION LINK : https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a=""; String b="";
        for(int i=0;i<word1.length;i++)
        {
            a=a+word1[i];
        }
        for(int i=0;i<word2.length;i++)
        {
            b=b+word2[i];
        }
        return a.equals(b); 

    }
}
