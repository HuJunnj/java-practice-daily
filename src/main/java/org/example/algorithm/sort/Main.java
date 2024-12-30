package org.example.algorithm.sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,4,7,3,5,9,0};
        System.out.println("排序前");
        for(int i: arr) {
            System.out.print(i);
        }
        Main main = new Main();
        //main.bubbleSort(arr);
        main.insertSort(arr);
        System.out.println("排序后");
        for(int i: arr) {
            System.out.print(i);
        }
    }
    // 冒泡排序
    public void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i= 0; i < len -1; i++) {
            for(int j = 0; j < len -i -1; j++) {
                int leftTemp = arr[j];
                if(arr[j] > arr[j+1]) {
                    arr[j] = arr[j+1];
                    arr[j+1] = leftTemp;
                }
            }
        }
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
