package com.company.web;

public class Task19 {

    public <N extends String> void method(N a){
        System.out.println(a);
    }
//    public <N extends String & Integer> void method(N a){
//        System.out.println(a);
//    }
}
