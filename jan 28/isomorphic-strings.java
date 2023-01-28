PROBLEM LINK: https://leetcode.com/problems/isomorphic-strings/description/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        char [] a = new char[128];
        char [] b = new char[128];
        for(int i=0; i<s.length(); i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if((a[s1]==(char)0) && (b[t1]==(char)0)){
                a[s1]=t1;
                b[t1]=s1;
            }
        }
        for(int i=0; i<s.length(); i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if(a[s1]!=t1 && b[t1]!=s1) return false;
        }
        return true;
    }
}
