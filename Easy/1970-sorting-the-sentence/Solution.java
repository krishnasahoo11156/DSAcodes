class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '1';
            ans[index] = word.substring(0, word.length() - 1);
        }
        StringBuilder res = new StringBuilder();
        for (String word : ans) {
            res.append(word).append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}