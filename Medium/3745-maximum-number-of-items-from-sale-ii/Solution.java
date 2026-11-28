import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int maxFactor = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            maxFactor = Math.max(maxFactor, item[0]);
            minPrice = Math.min(minPrice, item[1]);
        }

        int[] freq = new int[maxFactor + 1];

        for (int[] item : items) {
            freq[item[0]]++;
        }

        int[] eligible = new int[maxFactor + 1];

        for (int i = 1; i <= maxFactor; i++) {
            for (int j = i; j <= maxFactor; j += i) {
                eligible[i] += freq[j];
            }
            eligible[i]--;
        }

        Arrays.sort(items, (a, b) -> Integer.compare(a[1], b[1]));

        int ans = 0;

        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];

            if (price >= 2 * minPrice || eligible[factor] <= 0) {
                continue;
            }

            int count = Math.min(eligible[factor], budget / price);

            budget -= count * price;
            ans += count * 2;
        }

        ans += budget / minPrice;

        return ans;
    }
}