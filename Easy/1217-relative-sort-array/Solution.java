class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        Integer[] nums = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            nums[i] = arr1[i];
        }
        Arrays.sort(nums, (a, b) -> {
            boolean inA = map.containsKey(a);
            boolean inB = map.containsKey(b);
            if (inA && inB)
                return map.get(a) - map.get(b);
            if (inA)
                return -1;
            if (inB)
                return 1;
            return a - b;
        });
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = nums[i];
        }
        return arr1;
    }
}