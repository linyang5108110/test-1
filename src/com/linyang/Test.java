package com.linyang;

import java.util.ArrayList;
import java.util.List;

public class Test implements Test4 {

    private String name;

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {


        int name = 0;


        int name2 = 0;
        System.out.println("name2 = " + name2);
        System.out.println("name = " + name);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("w");
            System.out.println("name = " + name);
        }

        List list = new ArrayList();
        list.add("ww");
        list.add("ww");

        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }

    }

    public void test2() {
        List list = new ArrayList();


    }

    @Override
    public void test() {

    }
}
