class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[] answer = new int[k];

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            ans.add(0);
        }

        for(int i = 0; i < nums.length; i++){
            int index = list.indexOf(nums[i]);
            ans.set(index, ans.get(index) + 1);
        }

        for(int i = 0; i < k; i++){
            int maxIndex = ans.indexOf(Collections.max(ans));
            answer[i] = list.get(maxIndex);

            ans.set(maxIndex, Integer.MIN_VALUE);
        }

        return answer;
    }
}