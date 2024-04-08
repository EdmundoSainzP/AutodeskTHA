package org.example;

/**
 * My first approach was, how can I solve this problem without using collections sorting function to prevent adding
 * more complexity than needed because if we scalate the number of elements in the array the complexity will increase,
 * first I need to look for the max values I can achieve this doing a for each loop on nums.
 * Second I'll need to store top three max values and top two min values (positive and negative because array can
 * contain negative and only two negative values can be used as of sign rules) this can be achieved by comparing values
 * and if n is bigger than max then we persist max throughout the other two max values and n will be the new max value,
 * same for negatives if n is smaller than min then we persist min to the other min value and n will be the new min
 * value.
 * And third, we already have the top three max values and top two min values, we have two possible solutions
 * product of the three max values or the product of the negative values and the top one max value, and this can be solved
 * by doing a comparison of the two to identify the bigger one.
 *
 * This solution is following a dynamic programing approach to split this problem into smaller ones.
 * This solution takes the assumption that minimum array length that can be used is three, if not an exception will be
 * thrown.
 *
 * I approached problem 3 solution first because looked more like a real life scenario, but did not present it because after
 * reading carefully instructions of activity, I decided to move forward with problem 1 because it was a more complex
 * problem. The solution is just straight forward validation of requirements in problem description.
 * Problem number 2 was almost like the same, it can be solved using Arrays.stream functionality looking for A having
 * two occurrences and a contains of 'LLL'.
 */

public class MaxProduct{
    public int maxProduct(int[] nums){
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException("Array must contain at least 3 elements");
        }
// initialize to the max opposite value for max and min values to start comparisons
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
//iterate on nums
        for (int num : nums) {
            //keeping track of the three maximum numbers encountered
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
            //keeping track of the two minimum numbers encountered
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
// use Math.max to return max value out of two possible solutions
        return Math.max(max1*max2*max3,max1*min1*min2);
    }
}
