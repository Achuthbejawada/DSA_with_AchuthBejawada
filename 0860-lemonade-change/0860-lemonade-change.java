class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fivecount = 0;
        int tencount = 0;
        int n=bills.length;

        for(int i=0;i<n;i++){
            if(bills[i] == 5){
                fivecount++;
            }else if(bills[i] == 10){
                if(fivecount >= 1){
                    tencount++;
                    fivecount -= 1;
                }else{
                    return false;
                }
            }else{
                    if(tencount >= 1 && fivecount >= 1){
                        tencount -= 1;
                        fivecount -= 1;
                     }else if(fivecount >= 3){
                        fivecount -= 3;
                     }else{
                        return false;
                     }
                }
            }
            return true;
        }
    }
