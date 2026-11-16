package org.example;

public class FindInArray {
    public static void main() {
        int[] nums = {100, 1, 4, 15};

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println(max);

    }
}
