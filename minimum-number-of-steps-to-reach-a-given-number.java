class Solution {
    static int minSteps(int d) {
        for(int i = 1; i < 2 * d; i++){
            int ap = (i * (i + 1)) / 2;
            if((ap + d) % 2 == 0 && ap >= d) return i;
        }
        return 2 * d;
    }
}
