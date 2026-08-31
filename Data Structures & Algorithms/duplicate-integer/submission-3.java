class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();

        for(int number : nums) {
            if(!intSet.add(number)) {
                return true;
            }
        }
        return false;
    }
}
