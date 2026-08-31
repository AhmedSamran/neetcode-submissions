class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int missingNumber = target - nums[i];
            if(map.containsKey(missingNumber)) {
                return new int[]{map.get(missingNumber), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
