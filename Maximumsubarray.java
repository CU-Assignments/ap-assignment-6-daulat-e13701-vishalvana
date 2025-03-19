public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];  
        int currentSubarraySum = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            currentSubarraySum = Math.max(nums[i], currentSubarraySum + nums[i]); 
            maxSum = Math.max(maxSum, currentSubarraySum); 
        }

        return maxSum;
    }
}
