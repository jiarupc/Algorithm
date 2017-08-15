package com.chapter_02_selection.selection_02;

public class SelectionSort{

    public static void sort(Comparable[] num) {
        for (int i = 0; i < num.length; i++) {

            // 寻找[i，n)区间的最小值
            int minIndex = i;

            for (int j = i + 1; j < num.length; j++)
                if (num[j].compareTo(num[minIndex]) < 0)
                    minIndex = j;

            swap(num, i, minIndex);
        }
    }

    private static void swap(Object num[], int i, int minIndex) {
        Object temp = num[i];
        num[i] = num[minIndex];
        num[minIndex] = temp;
    }

    public static void main(String[] args) {
        Integer[] num = {1, 3, 2, 5, 4, 9, 8, 7, 6};
        sort(num);
        System.out.println();
        for (Object temp : num)
            System.out.print(temp + " ");

        Double[] doubles = {1.0, 8.1, 7.10, 6.99, 7.2};
        SelectionSort.sort(doubles);
        System.out.println();
        for (Object temp : doubles)
            System.out.print(temp + " ");

        String[] str = {"b", "a", "c", "B", "A"};
        SelectionSort.sort(str);
        System.out.println();
        for (Object temp : str)
            System.out.print(temp + " ");

        Student[] students = new Student[4];
        students[0] = new Student("D", 90.0);
        students[1] = new Student("C", 10.0);
        students[2] = new Student("B", 95.0);
        students[3] = new Student("A", 95.0);
        SelectionSort.sort(students);
        System.out.println();
        for (Object temp : students)
            System.out.println(temp);

    }
}
