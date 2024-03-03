class Solution 
{
    public static long[] printFibb(int n) 
    {
        if (n <= 0) 
        {
            return new long[0];
        }
        long[] fibonacciNumbers = new long[n];
        fibonacciNumbers[0] = 1;
        if (n > 1)
        {
            fibonacciNumbers[1] = 1;
        }

        for (int i = 2; i < n; i++)
        {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        return fibonacciNumbers;
    }

    public static void main(String[] args) 
    {
        int n = 10;
        long[] result = printFibb(n);
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
