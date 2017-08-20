package com.chapter_02_selection.insertion_01;

public class InsertionSort {

    public static void sort(Comparable[] num) {
        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0; j--) {
                if (num[j].compareTo(num[j - 1]) < 0) {
                    swap(num, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(Object[] num, int i, int j) {
        Object temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] num = {1, 3, 2, 5, 4, 9, 8, 7, 6};
        sort(num);
        System.out.println();
        for (Object temp : num)
            System.out.print(temp + " ");

    }
}
