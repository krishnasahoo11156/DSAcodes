class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        StringBuilder regex = new StringBuilder("^[a-z]*");
        for(char c : pattern.toCharArray()){
            regex.append(c).append("[a-z]*");
        }
        regex.append("$");
        for(String query : queries){
            ans.add(query.matches(regex.toString()));
        }
        return ans;
    }
}