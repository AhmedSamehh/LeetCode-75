class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)
            return false;
        int firstMax = Integer.MAX_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){

            if(nums[i] <= firstMax) {
                firstMax = nums[i];
            } 
            else if(nums[i] <= secondMax) {
                secondMax = nums[i];
            } else{
                return true;
            }     
        }
        return false;
    }
}