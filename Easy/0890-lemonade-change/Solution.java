class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                five++;
            } else if(bills[i] == 10){
                ten++;
                five--;
                if(five < 0){
                    return false;
                }
            } else if(bills[i] == 20){
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                    if(ten < 0 || five < 0){
                        return false;
                    }
                }else if(five > 2){
                    five -= 3;
                    if(five < 0){
                        return false;
                    }
                } else{
                    return false;
                }
            }
        }
        
        return true;
    }
}