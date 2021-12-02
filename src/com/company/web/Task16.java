package com.company.web;

import java.util.List;

public class Task16 {
    public void method(List<? extends Number> t16) {
        long sum=0;
        for (Number a : t16) {
            sum=sum+a.longValue();
        }
        System.out.println("sum: "+sum);
    }
}
