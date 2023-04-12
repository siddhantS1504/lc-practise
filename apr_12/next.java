question link:https://leetcode.com/problems/next-greater-element-i/description/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     Map<Integer,Integer> map = new HashMap<>();
     Stack<Integer> st = new Stack<>();
     map.put(nums2[nums2.length-1],-1);
     st.push(nums2[nums2.length-1]);

     for(int i=nums2.length-2;i>=0;i--){
         while(!st.isEmpty() && st.peek()<nums2[i])
         st.pop();
         if(st.isEmpty()){
             map.put(nums2[i],-1);
         }
         else{
             map.put(nums2[i],st.peek());
         }
         st.push(nums2[i]);
     } 
     for(int i=0;i<nums1.length;i++){
         nums1[i] = map.get(nums1[i]);
     }
     return nums1;
    }
}
