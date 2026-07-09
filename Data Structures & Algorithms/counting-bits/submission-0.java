class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        while(n >= 0){
            if(n ==0){
                 result[n] =0;
            }
            result[n] = getOnes(n);
            n--;
        }
        return result;
    }
    public int getOnes(int m){
        int counter = 0;
        while(m > 0){
            counter += (m & 1);
            m = m >> 1;
       }
       return counter;
    }
}
