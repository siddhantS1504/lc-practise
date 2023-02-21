//PROBLEM LINK: https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int val:nums1){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int val:nums2){
            if(map.containsKey(val) && map.get(val)>0){
                ans.add(val);
                map.put(val,map.get(val)-1);
                }
        }
        int[] finalarr=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            finalarr[i]=ans.get(i);
        }
    return finalarr;
    }
}
