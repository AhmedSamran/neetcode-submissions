class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer>[] frequency = new List[nums.length + 1];

        for (int i = 0; i <= nums.length; i++) {
            frequency[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            frequency[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = frequency.length - 1; i > 0; i--) {
            for (int n : frequency[i]) {
                if (index < k) {
                    res[index++] = n;
                }
            }
        }
        return res;
    }
}