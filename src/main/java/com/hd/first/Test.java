package com.hd.first;


import com.hd.ssm.pojo.Student;

/**
 * Created by Chunyun on 2015/10/29.
 */
public class Test {
    public static void main(String args[]) {
//        System.out.println("com.hd.first.Test!");
//        String s1 = new String("abc");
//        System.out.println(s1);
        t1();
    }

    public static void t1() {
        int countOfCPU = Runtime.getRuntime().availableProcessors();
        System.out.println("CPU:" + countOfCPU);
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("MEMTOTAL:" + totalMemory);
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("MEMFREE:" + freeMemory);
        Student s1 = new Student(1, "zhangsan", "bj", 21);
        System.out.println(s1.getAddr());
        String addr = s1.getAddr();

    }
}
