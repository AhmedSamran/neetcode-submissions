class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1); // filling the map with key as the number and the value as it's frequency
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for(int i = buckets.length - 1; i > 0; i--) {
            if(index < k) {
                for(int n : buckets[i]) {
                    res[index++] = n;
                    if(index == k) {
                        return res;
                    }
                }
            } else {
                return res;
            }
        }
        return res;
    }
}
