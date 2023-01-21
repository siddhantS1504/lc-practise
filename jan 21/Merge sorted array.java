//QUESTION LINK:https://leetcode.com/problems/merge-sorted-array/description/


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c=0;

        for(int i=m;i<n+m;i++)
        {
            nums1[i]=nums2[c];
            c++;
        }

            int temp = 0;  
         for(int i=0; i < m+n; i++){  
                 for(int j=1; j < (m+n-i); j++){  
                          if(nums1[j-1] > nums1[j]){  
                                 //swap elements  
                                 temp = nums1[j-1];  
                                 nums1[j-1] = nums1[j];  
                                 nums1[j] = temp;  
                         }  
                          
                 }  
         } 
        
    }
}
