class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0, 0, new ArrayList<>());
        return ans;
    }
    private void backtrack(String s, int index, int parts,
                           List<String> path) {
        if (parts == 4 && index == s.length()) {
            ans.add(String.join(".", path));
            return;
        }
        if (parts == 4 || index == s.length())
            return;
        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String part = s.substring(index, index + len);
            if (part.length() > 1 && part.charAt(0) == '0')
                break;
            int value = Integer.parseInt(part);
            if (value > 255)
                break;
            path.add(part);
            backtrack(s, index + len, parts + 1, path);
            path.remove(path.size() - 1);
        }
    }
}