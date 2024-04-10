class Solution{
    static int findSingle(int n, int arr[]){
        int singlePerson = 0;
        for (int num : arr) {
            singlePerson ^= num;
        }
        return singlePerson;
    }
}
