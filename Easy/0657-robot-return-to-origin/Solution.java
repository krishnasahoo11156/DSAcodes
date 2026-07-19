class Solution {
    public boolean judgeCircle(String moves) {
        int vertical = 0; 
        int horizontal = 0;
        int hr = moves.indexOf('R');
        while(hr != -1){
            horizontal++;
            hr = moves.indexOf('R', hr + 1);
        }

        int hl = moves.indexOf('L');
        while(hl != -1){
            horizontal--;
            hl = moves.indexOf('L', hl + 1);
        }

        int vu = moves.indexOf('U');
        while(vu != -1){
            vertical++;
            vu = moves.indexOf('U', vu + 1);
        }

        int vd = moves.indexOf('D');
        while(vd != -1){
            vertical--;
            vd = moves.indexOf('D', vd + 1);
        }
        
        return (vertical == 0 && horizontal == 0);
    }
}