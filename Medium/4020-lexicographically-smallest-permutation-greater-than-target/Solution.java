class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] cnt = new int[26];
        for(char c : s.toCharArray()) cnt[c - 'a']++;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < target.length(); i++){
            int x = target.charAt(i) - 'a';
            if(cnt[x] > 0){
                cnt[x]--;
                ans.append(target.charAt(i));
            }else{
                for(int c = x + 1; c < 26; c++){
                    if(cnt[c] > 0){
                        ans.append((char)('a' + c));
                        cnt[c]--;
                        add(ans, cnt);
                        return ans.toString();
                    }
                }
                break;
            }
        }
        for (int i = ans.length() - 1; i >= 0; i--) {
            cnt[ans.charAt(i) - 'a']++;

            int x = target.charAt(i) - 'a';
            for (int c = x + 1; c < 26; c++) {
                if (cnt[c] > 0) {
                    StringBuilder res = new StringBuilder(target.substring(0, i));
                    res.append((char)('a' + c));
                    cnt[c]--;
                    add(res, cnt);
                    return res.toString();
                }
            }
        }

        return "";
    }

    private void add(StringBuilder sb, int[] cnt) {
        for (int c = 0; c < 26; c++)
            while (cnt[c]-- > 0)
                sb.append((char)('a' + c));
    }
}