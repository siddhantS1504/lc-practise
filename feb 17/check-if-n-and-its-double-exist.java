PROBLEM LINK : https://leetcode.com/problems/check-if-n-and-its-double-exist/description/




class Solution {
    public boolean checkIfExist(int[] arr) {
	    int n = arr.length;
		
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == 2 * arr[j]) return true;
            }
        }

        return false;
    }
}
