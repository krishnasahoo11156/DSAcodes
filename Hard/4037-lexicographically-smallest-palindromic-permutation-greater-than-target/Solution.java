class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();
        int[] cnt = new int[26];

        for (char c : s.toCharArray())
            cnt[c - 'a']++;

        int odd = 0;
        char mid = 0;

        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 == 1) {
                odd++;
                mid = (char) ('a' + i);
            }
        }

        if (odd > 1)
            return "";

        int[] half = new int[26];
        for (int i = 0; i < 26; i++)
            half[i] = cnt[i] / 2;

        int h = n / 2;
        int[] rem = half.clone();
        boolean possible = true;

        for (int i = 0; i < h; i++) {
            int x = target.charAt(i) - 'a';
            if (--rem[x] < 0) {
                possible = false;
                break;
            }
        }

        if (possible) {
            String left = target.substring(0, h);
            String candidate = left
                    + (n % 2 == 1 ? mid : "")
                    + new StringBuilder(left).reverse();

            if (candidate.compareTo(target) > 0)
                return candidate;
        }
        for (int i = h - 1; i >= 0; i--) {

            rem = half.clone();
            possible = true;
            for (int j = 0; j < i; j++) {
                int x = target.charAt(j) - 'a';

                if (--rem[x] < 0) {
                    possible = false;
                    break;
                }
            }

            if (!possible)
                continue;

            int cur = target.charAt(i) - 'a';
            int bigger = -1;

            for (int c = cur + 1; c < 26; c++) {
                if (rem[c] > 0) {
                    bigger = c;
                    break;
                }
            }

            if (bigger == -1)
                continue;

            rem[bigger]--;

            StringBuilder left = new StringBuilder();
            left.append(target, 0, i);
            left.append((char) ('a' + bigger));
            for (int c = 0; c < 26; c++) {
                while (rem[c] > 0) {
                    left.append((char) ('a' + c));
                    rem[c]--;
                }
            }

            String L = left.toString();

            return L
                    + (n % 2 == 1 ? mid : "")
                    + new StringBuilder(L).reverse();
        }

        return "";
    }
}