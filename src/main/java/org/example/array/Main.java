package org.example.array;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 3, 2, 5};
        int[] sdf = twoSum(arr,10);
        System.out.println(sdf);
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
}