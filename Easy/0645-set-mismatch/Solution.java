class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[nums[i] - 1]++;
        }
        for(int i = 0; i < nums.length; i++){
            if(ans[i] == 2){
                result[0] = i + 1;
            }else if(ans[i] == 0){
                result[1] = i + 1;
            }
        }
        return result;
    }
}