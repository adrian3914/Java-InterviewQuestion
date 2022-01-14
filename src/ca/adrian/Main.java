package ca.adrian;

import ca.adrian.leetCode.ArraysQuestions;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,3,4,2};
        int target = 6;

        var result = ArraysQuestions.twoSum(nums, target);
        System.out.println(java.util.Arrays.toString(result));
    }
}
