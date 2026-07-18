class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() -1; i>= 0; i--){
            if(s.charAt(i) == '#'){
                String temp = s.substring(i-2, i);
                int num = Integer.parseInt(temp);
                num+=96;
                sb.append((char)(num));
                i-=2;
            }else{
                int num = Character.getNumericValue(s.charAt(i));
                num += 96;
                sb.append((char)(num));
            }
        }
        sb.reverse();
        return sb.toString();
    }
}