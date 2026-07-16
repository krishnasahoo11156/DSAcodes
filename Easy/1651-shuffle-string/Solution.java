class Solution {
    public String restoreString(String s, int[] indices) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            pairs.add(new int[]{indices[i], s.charAt(i)});
        }
        Collections.sort(pairs, (a, b) -> a[0] - b[0]);
        StringBuilder ans = new StringBuilder();
        for (int[] pair : pairs) {
            ans.append((char) pair[1]);
        }
        return ans.toString();
    }
}