PROBLEM LINK: https://leetcode.com/problems/assign-cookies/description/

class Solution {

    public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int m = g.length ; int n = s.length ;
    int i= 0; 
    int j = 0 ; 
    int count = 0 ;
    while(i<m && j<n){
        if(s[j]<g[i]){
            j++;
        }else{
            i++;
            j++;
            count++;
        }
    }
    return count;
}
    
}
