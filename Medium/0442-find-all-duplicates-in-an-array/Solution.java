class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                answer.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }
        return answer;
    }
}