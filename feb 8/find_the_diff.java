PROBLEM LINK: https://leetcode.com/problems/find-the-difference/description/



class Solution {
public char findTheDifference(String s, String t) {
int i=0,j=0;
char tempArray[] = s.toCharArray();
 Arrays.sort(tempArray);

    
    s= new String(tempArray);
    
    
     char tempArray1[] = t.toCharArray();

    
    Arrays.sort(tempArray1);
   t= new String(tempArray1);
    while(i<s.length() && j<t.length()){
        if(s.charAt(i)!=t.charAt(j)) return t.charAt(j);
    else{
        i++;
        j++;
    }
    }
    
   return t.charAt(j);
}
}
