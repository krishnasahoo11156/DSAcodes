class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[nums[i] - 1]++;
        }
        for(int i = 0; i < nums.length; i++){
            if(ans[i] == 2){
                answer.add(i+1);
            }
        }
        return answer;
    }
}