class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int indexOfSeparator = str.indexOf('#', i);
            int length = Integer.valueOf(str.substring(i, indexOfSeparator));
            int endIndex = indexOfSeparator + length + 1;

            String s = str.substring(indexOfSeparator + 1, endIndex);
            decoded.add(s);
            i = endIndex;
        }

        return decoded;
    }
}
