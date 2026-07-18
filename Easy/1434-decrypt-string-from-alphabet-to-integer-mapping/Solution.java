class Solution{
    public String freqAlphabets(String s){
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if (i + 2 < s.length() && s.charAt(i + 2) == '#'){
                int num = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                ans.append((char)('a' + num - 1));
                i += 3;
            }else{
                ans.append((char)('a' + (s.charAt(i) - '0') - 1));
                i++;
            }
        }
        return ans.toString();
    }
}