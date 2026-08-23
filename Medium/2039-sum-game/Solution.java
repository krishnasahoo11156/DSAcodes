class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int half = n / 2;
        int sumLeft = 0;
        int sumRight = 0;
        int qLeft = 0;
        int qRight = 0;
        for(int i = 0; i < half; i++){
            if(num.charAt(i) == '?'){
                qLeft++;
            }else{
                sumLeft += num.charAt(i) - '0';
            }
        }
        for(int i = half; i < n; i++){
            if(num.charAt(i) == '?'){
                qRight++;
            }else{
                sumRight += num.charAt(i) - '0';
            }
        }

        int diff = sumLeft - sumRight;
        return diff * 2 != (qRight - qLeft) * 9;
    }
}