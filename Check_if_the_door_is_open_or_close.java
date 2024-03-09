class Solution {
    static int[] checkDoorStatus(int N) {
        int[] doors = new int[N];
        for (int i = 1; i <= N; i++) {
            if (Math.sqrt(i) % 1 == 0) { // if i is a perfect square
                doors[i - 1] = 1; // open the door
            }
        }
        return doors;
    }
}
