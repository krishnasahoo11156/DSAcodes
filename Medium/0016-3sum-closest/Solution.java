class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int required = target - nums[i] - nums[j];
                int left = j + 1;
                int right = n - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    int sum = nums[i] + nums[j] + nums[mid];
                    if (Math.abs(sum - target) < Math.abs(closest - target)) {
                        closest = sum;
                    }
                    if (nums[mid] < required) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                if (left < n) {
                    int sum = nums[i] + nums[j] + nums[left];
                    if (Math.abs(sum - target) < Math.abs(closest - target))
                        closest = sum;
                }
                if (right > j) {
                    int sum = nums[i] + nums[j] + nums[right];
                    if (Math.abs(sum - target) < Math.abs(closest - target))
                        closest = sum;
                }
            }
        }
        return closest;
    }
}