class Solution{
    public static boolean isPowerofTwo(long n){
        if (n < 0) {
        return false;
    }
    return (n != 0) && ((n & (n - 1)) == 0);
    }  
}
