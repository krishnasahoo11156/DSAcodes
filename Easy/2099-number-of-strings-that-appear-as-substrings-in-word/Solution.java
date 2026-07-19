class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            for (int i = 0; i <= word.length() - pattern.length(); i++) {
                int j = 0;
                while (j < pattern.length()
                        && word.charAt(i + j) == pattern.charAt(j)) {
                    j++;
                }
                if (j == pattern.length()) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}