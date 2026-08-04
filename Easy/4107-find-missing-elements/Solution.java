class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] - nums[i] != 1){
                int count = nums[i + 1] - nums[i];
                int k = 1;
                while(count > 1){
                    ans.add(nums[i] + k);
                    count--;
                    k++;
                }
            }
        }
        return ans;
    }
}