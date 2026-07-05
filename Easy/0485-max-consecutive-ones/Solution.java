class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a = 0;
        int b = 0;
        int ans = 0;
        while(a < nums.length){
            int count = 0;
            while(b < nums.length){
                if(nums[b] == 1){
                    count++;
                    b++;
                }else if(nums[b] == 0){
                    b++;
                    break;
                }
            }
            ans = Math.max(count, ans);
            a = b;
        }
        return ans;
    }
}