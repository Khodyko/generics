package com.company.web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        //Task 1
        List<Integer> t1 = new ArrayList<>();

        t1.add(12);
        t1.get(0);
        //Task 2
        List t2 = new ArrayList();
        t2.add(12);
        t2.get(0);
        //Task 3
        List<Integer> t3 = new ArrayList<Integer>();
        List<Integer> t3_1 = new ArrayList<>();
        List<Integer> t3_2 = new ArrayList();
        //Task 4
        List<Integer> t4 = Collections.emptyList();
        List t4_1 = Collections.emptyList();
        //Task 5
        Task5<String> t5 = new Task5<>("abc");
        //Task 6
        Task6 task6 = new Task6();
        //Task 7
        Task7 t7 = new Task7(12);
        //Task 8
        List<Integer> t8Int = new ArrayList<>();
        t8Int.add(12);
        t8Int.add(13);
        t8Int.add(14);
        t8Int.add(15);
        List<Long> t8Long = new ArrayList<>();
        t8Long.add(143l);
        t8Long.add(145l);
        t8Long.add(146l);
        t8Long.add(147l);
        Task8 t8 = new Task8();
        t8.methodSumLong(t8Int);
        t8.methodSumLong(t8Long);
        //Task 9
        List<Integer> t9 = new ArrayList<Integer>();
        //Task 10
        Collection<Integer> t10 = new ArrayList<Integer>();
        //Task 11
        List<?> t11 = new ArrayList<Integer>();
        List<?> t11_1 = new ArrayList<Double>();
        List<?> t11_2 = new ArrayList<String>();
        //Task 12
        List<? extends Number> t12 = new ArrayList<Integer>();
        List<? extends Number> t12_1 = new ArrayList<Double>();
        //Task 13
        List<? super Integer> t13 = new ArrayList<Integer>();
        List<? super Integer> t13_1 = new ArrayList<Number>();
        List<? super Integer> t13_2 = new ArrayList<Object>();
        //Task 14
        Task14 task14 = new Task14();
        List<Object> t14List = new ArrayList<>();
        t14List.add(123);
        t14List.add("123Text");
        task14.method(t14List);
        //Task 15
        List<Object> t15 = new ArrayList<>();
        t15.add("123T");
        List<Integer> t15_1 = new ArrayList<>();
        t15_1.add(123);
        List<Double> t15_2 = new ArrayList<>();
        t15_2.add(123.3d);
        Task15 task15 = new Task15();
        task15.method(t15);
        task15.method(t15_1);
        task15.method(t15_2);
        //Task 16
        List<Integer> t16 = new ArrayList<>();
        t16.add(12);
        t16.add(13);
        t16.add(14);
        List<Long> t16_1 = new ArrayList<>();
        t16_1.add(12l);
        t16_1.add(13l);
        t16_1.add(14l);
        Task16 task16 = new Task16();
        task16.method(t16);
        task16.method(t16_1);
        //Task 17
        List<Integer> t17 = new ArrayList<>();
        List<Number> t17_1 = new ArrayList<>();
        List<Object> t17_2 = new ArrayList<>();
        Task17 task17 = new Task17();
        t17 = (List<Integer>) task17.method(t17);
        t17_1 = (List<Number>) task17.method(t17_1);
        t17_2 = (List<Object>) task17.method(t17_2);
        //Task 18
        //In the class + screenshot
        //Task 19
        Task19 task19 = new Task19();
        task19.method("qwe");

    }
}
