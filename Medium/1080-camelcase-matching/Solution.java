class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for(String query : queries){
            ans.add(match(query, pattern));
        }
        return ans;
    }

    public boolean match(String query, String pattern){
        int i = 0, j = 0;
        while(i < query.length()){
            if(j < pattern.length() && query.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }else if(Character.isLowerCase(query.charAt(i))){
                i++;
            }else{
                return false;
            }
        }
        return j == pattern.length();
    }
}