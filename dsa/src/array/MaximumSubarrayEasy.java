package array;

/**
 * NO : 53. Maximum Subarray
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 *
 *  Example 1:
 *  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 *  Output: 6
 *  Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 *
 *  Example 2:
 *  Input: nums = [1]
 *  Output: 1
 *  Explanation: The subarray [1] has the largest sum 1.
 *
 *  Example 3:
 *  Input: nums = [5,4,-1,7,8]
 *  Output: 23
 *  Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 *
 * Link: https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarrayEasy {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.printf("Result : "+maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int current = 0;
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(current < 0) {
                current = 0;
            }
            current = current + nums[i];
            max = Math.max(current, max);
        }
        return max;
    }
}
