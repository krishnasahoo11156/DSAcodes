class Solution {
    public String restoreString(String s, int[] indices) {
        String ans = "";
        char[] arr = new char[indices.length];
        for(int i = 0; i < indices.length; i++){
            arr[indices[i]] = s.charAt(i);
        }
        for(int i = 0; i < indices.length; i++){
            ans += arr[i];
        }
        return ans;
    }
}