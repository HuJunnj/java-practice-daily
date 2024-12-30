package org.example.algorithm.find;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,4,7,3,5,9,0};
        Main main = new Main();
        //使用插入排序先给乱序数组排序
        main.insertSort(arr);
        //使用查找算法找出目标值
        int element = main.binarySearch(arr,10);
        System.out.println(element);

    }
    public int sequentialSearch(int[] arr, int target) {
        for (int i: arr) {
            if(arr[i] == target) {
                return arr[i];
            }
        }
        return -1;
    }
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;
        while (left <= right) {
            int mid =left + (right - left)/2;
            if (arr[mid] == target) {
                return target;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }

        }

        return -1;  // 未找到目标元素
    }
    // 插入排序
    public void insertSort(int[] arr) {
        // 从第二个元素开始
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // 当前待插入的元素
            int j = i - 1;

            // 向左移动已排序部分的元素
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // 移动元素
                j--;
            }

            // 将当前元素插入到正确位置
            arr[j + 1] = key;
        }
    }
}
