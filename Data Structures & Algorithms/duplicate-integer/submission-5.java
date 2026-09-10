class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupl = new HashSet<>();
        for(int num : nums) {
            boolean added = dupl.add(num);
            if(!added) {
                return true;
            }
        }
        return false;
    }
}