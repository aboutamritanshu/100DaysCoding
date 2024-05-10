class Solution {
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> mainList = new ArrayList<>();
        Arrays.sort(arr);
        HashSet<List<Integer>> hs = new HashSet<>();
        Combination(arr,0,0, k,n,list,mainList,hs);
        return mainList;
    }
    
    public void Combination(int[] arr, int i, int sum, int k, int n, List<Integer> list, List<List<Integer>> mainList,HashSet<List<Integer>> hs)
    {
        if(sum == k)
        {
            if(!hs.contains(list))
            {
               mainList.add(new ArrayList<>(list));
               hs.add(list);
            }
            return;
        }
        
        if(i == n)
        {
            return;
        }
        
        if(sum + arr[i] <= k)
        {
            list.add(arr[i]);
            Combination(arr,i+1,sum+arr[i],k,n,list,mainList,hs);
            list.remove(list.size()-1);
            Combination(arr,i+1,sum,k,n,list,mainList,hs);
        }
        else
        {
            Combination(arr,i+1,sum,k,n,list,mainList,hs);
        }
    }
}
