class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n > m) return false;
        int[] left = new int[n];
        int[] right = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < m && t.charAt(j) != s.charAt(i)) {
                j++;
            }
            if (j == m) {
                left[i] = -1;
            } else {
                left[i] = j;
                j++;
            }
        }
        if (left[n - 1] != -1) return true;
        j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            while (j >= 0 && t.charAt(j) != s.charAt(i)) {
                j--;
            }
            if (j < 0) {
                right[i] = -1;
            } else {
                right[i] = j;
                j--;
            }
        }
        for (int i = 0; i < n; i++) {
            int prev = -1;
            if (i > 0) {
                if (left[i - 1] == -1) continue;
                prev = left[i - 1];
            }
            int next = m;
            if (i < n - 1) {
                if (right[i + 1] == -1) continue;
                next = right[i + 1];
            }
            if (prev + 1 < next) {
                return true;
            }
        }
        return false;
    }
}