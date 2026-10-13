class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList();
        int i = 0;
        
        while(i < str.length()) {
            int indexOfSeperator = str.indexOf('#', i);

            int lengthOfDecodedString = Integer.valueOf(str.substring(i, indexOfSeperator));

            int endOfStringIndex = indexOfSeperator + lengthOfDecodedString + 1;

            String s = str.substring(indexOfSeperator + 1, endOfStringIndex);

            decoded.add(s);

            i = endOfStringIndex;
        }
    return decoded;
    }
}
