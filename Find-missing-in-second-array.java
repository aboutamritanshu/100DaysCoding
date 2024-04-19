class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : b) {
            set.add(num);
        }
        for (int num : a) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
    }
}
