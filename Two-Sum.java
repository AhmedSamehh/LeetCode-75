class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map<> m = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[] {-1,-1};
    }
}