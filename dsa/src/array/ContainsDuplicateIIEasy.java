package array;

import java.util.HashSet;
import java.util.Set;

/**
 * NO: 219. Contains Duplicate II
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class ContainsDuplicateIIEasy {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.printf("Result is: "+containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> unique = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(unique.contains(nums[i])) {
                return true;
            }
            unique.add(nums[i]);
            if(unique.size() > k) {
                unique.remove(nums[i - k]);
            }
        }
        return false;
    }
}
