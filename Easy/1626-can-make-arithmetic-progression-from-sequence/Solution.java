import java.util.HashSet;
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        if((max - min) % (n - 1) != 0)
            return false;
        int diff = (max - min) / (n - 1);
        if(diff == 0)
            return true;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            if((num - min) % diff != 0)
                return false;
            if(!set.add(num))
                return false;
        }
        for(int i = 0; i < n; i++) {
            if(!set.contains(min + i * diff))
                return false;
        }
        return true;
    }
}