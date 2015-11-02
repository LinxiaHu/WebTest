package com.hd.ssm.pojo;

/**
 * Created by Chunyun on 2015/11/2.
 */
public class Student {

    private int id;

    public Student(int id, String name, String addr, int age) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.age = age;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String addr;
    private int age;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
