class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int res = 0;
        while(left < right) {
            int lowestBar = Math.min(heights[left], heights[right]);
            int area = lowestBar * (right - left);
            res = Math.max(area, res);
            if(lowestBar == heights[left]) {
                left++;
            } else { right--;}
        }
        return res;
    }
}
