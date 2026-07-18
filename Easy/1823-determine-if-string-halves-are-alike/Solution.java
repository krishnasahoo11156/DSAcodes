class Solution {
    public boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
    public boolean halvesAreAlike(String s) {
        int count = 0;
        for(int i = 0; i < s.length()/2; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i + s.length()/2))){
                count--;
            }
        }
        return count == 0;
    }
}