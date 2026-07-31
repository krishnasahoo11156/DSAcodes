class Solution {
    public int longestPalindrome(String s) {
        List<Character> list1 = new ArrayList<>();
        int finalans = 0;
        for(int i = 0; i < s.length(); i++){
            if(!list1.contains(s.charAt(i))){
                list1.add(s.charAt(i));
            }
        }
        int[] arr = new int[list1.size()];
        for(int i = 0; i < list1.size(); i++){
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == list1.get(i)) {
                    count++;
                }
            }
            arr[i] = count;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                finalans++;
                break;
            }
            if(arr[i] > 1 && arr[i] % 2 == 1){
                finalans++;
                break;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 1){
                if(arr[i] % 2 == 1){
                    finalans += (arr[i]-1);
                }else{
                    finalans += arr[i];
                }
            }
        }

        return finalans;
    }
}