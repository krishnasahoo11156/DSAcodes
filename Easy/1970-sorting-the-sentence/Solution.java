class Solution {
    public String sortSentence(String s) {
        String[] ans = new String[9];
        int start = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                String word = s.substring(start, i);
                int index = word.charAt(word.length() - 1) - '1';
                ans[index] = word.substring(0, word.length() - 1);
                start = i + 1;
            }
        }
        StringBuilder res = new StringBuilder();
        for (String word : ans) {
            if (word != null) {
                res.append(word).append(" ");
            }
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}