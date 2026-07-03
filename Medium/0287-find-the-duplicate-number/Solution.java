class Solution {
    public int findDuplicate(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[nums[i] - 1]++;
        }
        for(int i = 0; i < nums.length; i++){
            if(ans[i] >= 2){
                return i+1;
            }
        }
        return -1;
    }
}