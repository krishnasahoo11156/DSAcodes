class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (!set.add(count))
                    return false;

                count = 1;
            }
        }
        return set.add(count);
    }
}