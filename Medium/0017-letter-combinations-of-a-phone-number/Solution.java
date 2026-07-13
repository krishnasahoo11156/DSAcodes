class Solution {
    List<String> ans = new ArrayList<>();
    String[] map = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return ans;
        backtrack(digits, 0, "");
        return ans;
    }
    private void backtrack(String digits, int index, String current){
        if(index == digits.length()){
            ans.add(current);
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++){
            backtrack(digits, index + 1, current + letters.charAt(i));
        }
    }
}