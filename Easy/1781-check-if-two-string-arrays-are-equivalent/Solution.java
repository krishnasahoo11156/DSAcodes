class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i = 0, j = 0;
        int k = 0, l = 0;
        while (i < word1.length && k < word2.length) {
            if (word1[i].charAt(j) != word2[k].charAt(l))
                return false;
            j++;
            l++;
            if (j == word1[i].length()) {
                i++;
                j = 0;
            }
            if (l == word2[k].length()) {
                k++;
                l = 0;
            }
        }
        return i == word1.length && k == word2.length;
    }
}