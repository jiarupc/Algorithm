package com.chapter_02_selection.selection_01;

public class SelectionSort {

    private static void sort(int[] num) {
        for (int i = 0; i < num.length; i++) {

            // 定义最小值下标
            int minIndex = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[minIndex]) {
                    minIndex = j;
                }
            }
            swap(num, i, minIndex);
        }
    }

    private static void swap(int[] num, int i, int minIndex) {
        int temp = num[i];
        num[i] = num[minIndex];
        num[minIndex] = temp;
    }


    public static void main(String[] args) {
        int[] num = {1, 3, 2, 5, 4, 9, 8, 7, 6};
        sort(num);
        System.out.println();
        for (Object temp : num)
            System.out.print(temp + " ");

    }
}

