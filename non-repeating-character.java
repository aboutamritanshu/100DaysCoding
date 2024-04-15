class Solution {
    static char nonrepeatingCharacter(String S) {
        HashMap<Character, Integer> charFreq = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (charFreq.get(c) == 1) {
                return c;
            }
        }

       
        return '$';
    }
}
