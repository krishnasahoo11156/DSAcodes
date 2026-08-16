class Solution {
    public boolean stoneGameIX(int[] stones) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int stone : stones) {
            if (stone % 3 == 0) {
                count0++;
            } 
            else if (stone % 3 == 1) {
                count1++;
            } 
            else {
                count2++;
            }
        }
        if (Math.min(count1, count2) == 0) {
            return Math.max(count1, count2) > 2 && count0 % 2 == 1;
        }
        return Math.abs(count1 - count2) > 2 || count0 % 2 == 0;
    }
}