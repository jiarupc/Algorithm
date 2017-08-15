package com.chapter_02_selection.selection_03;

import com.chapter_02_selection.selection_02.SelectionSort;

class SortTestHelper {

    // 生成测试用例
    // 生成有n个元素的随机数组,每个元素的随机范围为[rangeL, rangeR]
    static Integer[] generateRandomArray(int n, int rangeL, int rangeR){
        assert rangeL <= rangeR;

        Integer[] array = new Integer[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (rangeR - rangeL + 1) + rangeL);
        }
        return array;
    }

    // 打印排序结果
    static void printArray(Object[] array) {
        for (Object anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
    }

    private static boolean isSorted(Comparable[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i].compareTo(num[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }

    // 排序性能测试
    public static void testSort(Comparable[] num){
        long startTime = System.currentTimeMillis();
        SelectionSort.sort(num);
        long endTime = System.currentTimeMillis();

        assert isSorted(num);

        long spentTime = endTime - startTime;
        System.out.println(spentTime + " ms");
    }
}
