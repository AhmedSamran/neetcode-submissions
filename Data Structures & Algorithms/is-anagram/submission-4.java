class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] counts = new int[26];
        int i = 0;
        while(i < s.length()) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
            i++;
        }
        for(int count : counts) {
            if(count != 0) return false;
        }
        return true;
    }
}