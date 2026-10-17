import java.util.Arrays;
class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = digitSum(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = arr[i][0];
        }

        // Map each value to its target index.
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[i] = i;
        }

        // Find where each original value belongs.
        java.util.HashMap<Integer, Integer> index = new java.util.HashMap<>();
        for (int i = 0; i < n; i++) {
            index.put(sorted[i], i);
        }

        int[] perm = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = index.get(nums[i]);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int j = i;
            int cycleSize = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = perm[j];
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += cycleSize - 1;
            }
        }

        return swaps;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
