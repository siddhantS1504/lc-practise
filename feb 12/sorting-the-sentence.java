PROBLEM LINK : https://leetcode.com/problems/sorting-the-sentence/description/


class Solution 
{
    public String sortSentence(String s) 
    {
        String a[] = s.split(" ");
        int n = a.length;
        String b[] = new String[n];
        for(int i=0; i<n; i++)
        {
            int l = a[i].length();
            char p = a[i].charAt(l-1);
            int k = p - '0';
            b[k-1] = a[i].substring(0,l-1);
        }
        String str="";
        for(int i=0; i<n; i++)
        {
            str = str + b[i] + " ";
        }
        return str.trim();
    }
}
