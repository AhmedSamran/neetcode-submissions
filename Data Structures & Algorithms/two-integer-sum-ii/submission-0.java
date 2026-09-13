class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int candidate = numbers[i] + numbers[j];
            if(candidate > target) {
                j--;
            } else if(candidate < target) {
                i++;
            } else {
                i++;
                j++;
                return new int[]{i,j};
            }
        }
        throw new IllegalStateException("No valid pair found — violates problem guarantee");
    }
}
