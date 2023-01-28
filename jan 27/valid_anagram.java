PROBLEM LINK: https://leetcode.com/problems/valid-anagram/description/


class Solution {
    public boolean isAnagram(String s, String t) {
        int sum1=0;int sum2=0;
        int n=s.length();
        int m=t.length();
        if(m!=n)
        {
            return false;
        }
        char []arr = s.toCharArray();
        Arrays.sort(arr);
        char []arr2 =t.toCharArray();
        Arrays.sort(arr2);
        s= new String(arr);
         t = new String(arr2);

        return s.equals(t);


    }
}
