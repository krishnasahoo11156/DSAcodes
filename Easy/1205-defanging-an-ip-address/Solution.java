class Solution {
    public String defangIPaddr(String address) {
        String ans = "";
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                ans += "[.]";
            }else{
                ans += address.substring(i,i+1);
            }
        }
        return ans;
    }
}