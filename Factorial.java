class Solution{
    static long factorial(int N){
        if(N == 0 || N == 1) {
            return 1;
        }

        long result = 1;
        for(int i = 2; i <= N; i++) {
            result *= i;
        }

        return result;
    }
}
