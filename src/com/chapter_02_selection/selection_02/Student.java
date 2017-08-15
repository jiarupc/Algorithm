package com.chapter_02_selection.selection_02;

public class Student implements Comparable<Student> {

    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
        super();
    }

    // 定义Student的compareTo函数
    // 如果分数相等，则按照名字的字母序排序
    // 如果分数不等，则分数高的靠前
    @Override
    public int compareTo(Student that) {

        if( this.score == that.score )
            return this.name.compareTo(that.name);

        if( this.score < that.score )
            return 1;
        else if( this.score > that.score )
            return -1;
        else // this.score == that.score
            return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
