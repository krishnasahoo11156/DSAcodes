class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int digit : digits){
            freq[digit]++;
        }
        int count = 0;
        for(int num = 100; num <= 999; num++){
            if(num % 2 != 0){
                continue;
            }
            int n = num;
            int[] required = new int[10];
            for(int i = 0; i < 3; i++){
                required[n % 10]++;
                n /= 10;
            }
            boolean possible = true;
            for(int d = 0; d <= 9; d++){
                if(required[d] > freq[d]){
                    possible = false;
                    break;
                }
            }
            if(possible){
                count++;
            }
        }
        return count;
    }
}