class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] counts = new int[26];
        int i = 0;

        while(s.length() > i) {
            int foundCharIndexInFirstString = s.charAt(i) - 'a';
            int foundCharIndexInSecondString = t.charAt(i) - 'a';
            counts[foundCharIndexInFirstString]++;
            counts[foundCharIndexInSecondString]--;
            i++;
        }

        for(int count : counts) {
            if(count != 0) return false;
        }
        return true;
    }
}