class Reverse
{
    public static String reverseWord(String str)
    {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            
            start++;
            end--;
        }
        return new String(charArray);
    }
}
