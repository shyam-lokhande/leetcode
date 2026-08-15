class Solution {
    public int longestSubsequence(int[] nums) {
        int result = 0;
        boolean isAllZero = true;
        for(int i : nums){
            result = result ^ i;
            if(i != 0){
                isAllZero = false;
            }
        }
        if(isAllZero) return 0;
        if(result == 0) return nums.length-1;
        return nums.length;
    }
}