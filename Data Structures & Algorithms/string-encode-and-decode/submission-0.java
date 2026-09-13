class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0; // current position in str
    
        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);   // starts searching from index 0 → finds '#' at index 1
            int length = Integer.parseInt(str.substring(i, hashIndex)); // substring(0, 1) → "3" → parseInt → 3
            String word = str.substring(hashIndex + 1, hashIndex + length + 1);
            decoded.add(word);
            i = hashIndex + 1 + length;
        }
        return decoded;
    }
}
