package com.company.web;

import java.util.List;

public class Task8 {

public <T extends Number> void  methodSumLong(List<T> t8){
    long sum=0;
    for (T a:t8) {
        sum=sum+ a.longValue();
    }
    System.out.println("sum= "+sum);
    }

}
