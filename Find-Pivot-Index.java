class Solution {
    public int pivotIndex(int[] nums) {
        int lSum = 0;
        int totalSum = 0;
        for(int i=0;i<nums.length;i++) {
            totalSum += nums[i];
        }
        int rSum = totalSum - nums[0];

        for(int i=0;i<nums.length;i++) {
            if(lSum == rSum) 
                return i;
            lSum += nums[i];
            rSum -= (i<nums.length-1?nums[i+1] : 0);
        }
        return -1;
    }
}