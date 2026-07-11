class Solution {
    int[] values = {
        1000, 900, 500, 400,
        100, 90, 50, 40,
        10, 9, 5, 4, 1
    };
    String[] symbols = {
        "M", "CM", "D", "CD",
        "C", "XC", "L", "XL",
        "X", "IX", "V", "IV", "I"
    };
    public String intToRoman(int num) {
        return solve(num);
    }
    private String solve(int num) {
        if (num == 0)
            return "";
        for (int i = 0; i < values.length; i++) {
            if (num >= values[i]) {
                return symbols[i] + solve(num - values[i]);
            }
        }
        return "";
    }
}