class Solution {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        HashMap<Character, Integer> freqA = new HashMap<>();
        HashMap<Character, Integer> freqB = new HashMap<>();

        for (char c : a.toCharArray()) {
            freqA.put(c, freqA.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            freqB.put(c, freqB.getOrDefault(c, 0) + 1);
        }

        return freqA.equals(freqB);
    }
}
