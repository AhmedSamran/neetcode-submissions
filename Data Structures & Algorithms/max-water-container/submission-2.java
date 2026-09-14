class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int amount = Integer.MIN_VALUE;
        while(left < right) {
            amount = Math.max(Math.min(heights[left], heights[right]) * (right - left), amount);
            if(heights[left] > heights[right]) right--;
            else left++;
        }
        return amount;
    }
}
