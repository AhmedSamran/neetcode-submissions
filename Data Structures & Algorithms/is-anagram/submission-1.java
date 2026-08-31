class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            int countS = mapS.computeIfAbsent(s.charAt(i), val -> 0);
            int countT = mapT.computeIfAbsent(t.charAt(i), val -> 0);

            mapS.put(s.charAt(i), countS + 1);
            mapT.put(t.charAt(i), countT + 1);
        }
        return mapS.equals(mapT);
    }
}
