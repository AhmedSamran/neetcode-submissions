class Solution {
    public int majorityElement(int[] nums) {
        int maj = 0;
        int count = 0;
        for(int n : nums) {
            if(count == 0) {
                maj = n;
            }
            if(maj == n) {
                count++;
            } else {
                count--;
            }
        }
        return maj;
    }
}