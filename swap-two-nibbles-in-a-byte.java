class Solution {
    static int swapNibbles(int n) {
        int first=n%16; 
        int second=n/16; 
        return first*16+second;  
    }
}
