class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        int thousands = num / 1000;
        while (thousands-- > 0)
            ans.append("M");
        int hundreds = (num % 1000) / 100;
        append(ans, hundreds, 'C', 'D', 'M');
        int tens = (num % 100) / 10;
        append(ans, tens, 'X', 'L', 'C');
        int ones = num % 10;
        append(ans, ones, 'I', 'V', 'X');
        return ans.toString();
    }
    private void append(StringBuilder sb, int digit, char one, char five, char ten) {
        if (digit <= 3) {
            while (digit-- > 0)
                sb.append(one);
        } else if (digit == 4) {
            sb.append(one).append(five);
        } else if (digit <= 8) {
            sb.append(five);
            while (digit-- > 5)
                sb.append(one);
        } else {
            sb.append(one).append(ten);
        }
    }
}