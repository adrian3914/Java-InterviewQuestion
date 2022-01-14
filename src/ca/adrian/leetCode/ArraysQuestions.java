package ca.adrian.leetCode;

public class ArraysQuestions {

    /*
        1. Two Sum

        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example:
        ----------------------------------------------------------------------
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
       ----------------------------------------------------------------------
       Input: nums = [3,2,4], target = 6
       Output: [1,2]
       ----------------------------------------------------------------------

     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int j;

        for (int i = 0; i < nums.length; i++){
            j = i + 1;

            if (nums == null || result.length == 1){
                break;
            }

            if (i != nums.length-1){
                while(j < nums.length){
                    if ( nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                    j++;
                }
            }
        }
        return result;
    }
}
