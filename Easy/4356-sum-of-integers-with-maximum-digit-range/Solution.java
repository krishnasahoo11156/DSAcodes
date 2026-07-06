class Solution {
    public int maxDigitRange(int[] nums) {
        int[] digitrange = new int[nums.length];
        int maxdiff = 0;

        for (int i = 0; i < nums.length; i++) {
            String num = String.valueOf(nums[i]);

            int j = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            while (j < num.length()) {
                int temp = num.charAt(j) - '0';
                max = Math.max(max, temp);
                min = Math.min(min, temp);
                j++;
            }

            digitrange[i] = max - min;
            maxdiff = Math.max(maxdiff, digitrange[i]);
        }

        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (digitrange[i] == maxdiff) {
                answer += nums[i];
            }
        }

        return answer;
    }
}