package com.eviltester.webdriver;


public class Partitions {
    public static void main(String[] args) {
        System.out.println(canPartition(new int[] { 2, 8, 4, 1 })); // true
        System.out.println(canPartition(new int[] { -1, -10, 1, -2, 20 })); // false
        System.out.println(canPartition(new int[] { -1, -20, 5, -1, -2, 2 })); // true
    }

    public static boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int totalProduct = 1;
        int zeroCount = 0;

        // Calculate the total product of all elements
        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            } else {
                zeroCount++;
            }
        }

        for (int num : nums) {
            if (num == 0) {
                // If num is 0, it can only satisfy the condition if there are multiple zeros in
                // the array
                if (zeroCount > 1) {
                    return true;
                }
            } else if (totalProduct / num == num) {
                // Check if the product of all other elements equals the current element
                return true;
            }
        }

        return false;
    }
}