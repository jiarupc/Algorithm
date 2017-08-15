package com.chapter_02_selection.selection_03;

public class SelectionSort {


    public static void main(String[] args) {
        int n = 200000;
        Integer[] num = SortTestHelper.generateRandomArray(n, 0, n);
//        com.chapter_02_selection.selection_02.SelectionSort.sort(num);
//        SortTestHelper.printArray(num);

        SortTestHelper.testSort(num);
    }
}
