class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int h = 0;

        while(left<right) {
            h = Math.max(h, (right - left) * Math.min(height[left], height[right]));
            if(height[left] > height[right]) {
                right--;
            }
            else {
                left++;
            }
        }
        return h;
    }
}