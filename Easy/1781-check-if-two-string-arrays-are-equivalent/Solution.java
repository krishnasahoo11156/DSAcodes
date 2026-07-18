class Solution{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2){
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for(int i = 0; i < word1.length; i++){
            for(int j = 0; j < word1[i].length(); j++){
                list1.add(word1[i].charAt(j));
            }
        }
        for(int i = 0; i < word2.length; i++){
            for(int j = 0; j < word2[i].length(); j++){
                list1.add(word2[i].charAt(j));
            }
        }
        return String.join("", word1).equals(String.join("", word2));
    }
}