class Solution {
    public int maxProduct(int[] nums) {
        int prod = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length - 1; i++){
            for(int j = i + 1; j<nums.length; j++){
                prod = Math.max(prod, (nums[i]-1)*(nums[j]-1));
            }
        }
        return prod;
    }
}