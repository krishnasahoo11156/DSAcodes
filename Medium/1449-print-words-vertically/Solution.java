class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        List<String> ans = new ArrayList<>();

        int max = 0;
        for(int i = 0; i < words.length; i++){
            max = Math.max(max, words[i].length());
        }

        for(int i = 0; i < max; i++){

            StringBuilder sc = new StringBuilder();

            for(int j = 0; j < words.length; j++){

                if(i < words[j].length()){
                    sc.append(words[j].charAt(i));
                }
                else{
                    sc.append(" ");
                }
            }

            while(sc.length() > 0 && sc.charAt(sc.length() - 1) == ' '){
                sc.deleteCharAt(sc.length() - 1);
            }

            ans.add(sc.toString());
        }

        return ans;
    }
}