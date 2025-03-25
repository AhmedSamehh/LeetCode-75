class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zeros= 0;
        int out = 0;
        if(flowerbed.length == 1){
            if(flowerbed[0] == 0  && n == 1)
                return true;
            if(flowerbed[0] == 1 && n == 1)
                return false;
        }
        for(int i=0;i<flowerbed.length;i++) {
            if(flowerbed[i] == 1){
                zeros = 0;
                continue;
            }
            if(i == flowerbed.length - 1 && zeros == 1) {
                flowerbed[i] = 1;
                out++;
                break;
            }
            if(i == 1 && zeros == 1) {
                flowerbed[0] = 1;
                out++;
                continue;
            }
            if(zeros == 2) {
                flowerbed[i-1] = 1;
                out++;
                zeros = 1; 
                continue;
            }
            zeros++;
            
        }
        return out >= n;
    }
}