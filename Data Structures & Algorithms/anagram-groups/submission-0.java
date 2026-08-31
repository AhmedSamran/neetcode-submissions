class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> stringListMap = new HashMap<>();
        if (strs.length == 1) {
            result.add(Arrays.asList(strs));
            return result;
        }
        for (String sortedWord : strs) {
            char[] chars = sortedWord.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if (!stringListMap.containsKey(sortedString)) {
                stringListMap.put(new String(chars), new ArrayList<>());
            }
            stringListMap.get(new String(chars)).add(sortedWord);
        }
        return new ArrayList<>(stringListMap.values());
    }
}
