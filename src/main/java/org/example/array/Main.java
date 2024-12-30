package org.example.array;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*int[] arr = {2, 3, 7, 3, 2, 5};
        int[] sdf = twoSum(arr,10);
        System.out.println(sdf);*/
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(111);
    }

    public static int[] twoSum(int[] nums, int target) {
        // 创建一个哈希表来存储数组中元素的值及其索引
        HashMap<Integer, Integer> map = new HashMap<>();

        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // 计算目标值与当前数的差

            // 如果差值存在于哈希表中，说明找到了答案
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};  // 返回这两个数的索引
            }

            // 将当前数和其索引存入哈希表
            map.put(nums[i], i);
        }

        // 如果没有找到，返回空数组（或者可以抛出异常）
        throw new IllegalArgumentException("No two sum solution");
    }
    // 最大子数组和
    public static int maxSubArray(int[] nums) {
        // 初始化，currentSum 和 maxSum 都设为第一个元素
        int currentSum = nums[0];
        int maxSum = nums[0];

        // 从第二个元素开始遍历数组
        for (int i = 1; i < nums.length; i++) {
            // 当前子数组和要么累加当前元素，要么从当前元素重新开始
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // 更新 maxSum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static void moveZeroes(int[] nums) {
        int k = 0; // k 是非零元素应该放置的位置

        // 遍历数组，将非零元素移到前面
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }

        // 填充剩余位置为 0
        while (k < nums.length) {
            nums[k++] = 0;
        }
    }
}