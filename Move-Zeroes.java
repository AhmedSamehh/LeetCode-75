class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 1;


        while(right < nums.length) {
            if(nums[left] == 0 && nums[right] != 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
                right++;
            }
            else if(nums[left] == 0 && nums[right] == 0) {
                right++;
            }
            else {
                right++;
                left++;
            }
        }
    }
}