class Solution {
    public int countIncreasing(int[] arr) {
        
        int n = arr.length;
        long count = 0;
        
        int len = 1;
        
        for (int i = 1; i < n; i++) {
            
            if (arr[i] > arr[i - 1]) {
                len++;
            } else {
                count += (long)(len - 1) * len / 2;
                len = 1;
            }
        }
        
        count += (long)(len - 1) * len / 2;
        
        return (int) count;
    }
}