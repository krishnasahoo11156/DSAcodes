class Solution {
    public boolean halvesAreAlike(String s) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < s.length(); i++){
            if(i < s.length()/2){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                    a++;
                }   
            }else{
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                    b++;
                }
            }
        }
        if(a == b){
            return true;
        }
        return false;
    }
}