package com.zhss.oa.organ.service;

public class A {

    private String a;


    public A(){
        System.out.println(6);
    }


    public  A(String a){
        this.a = a;
        System.out.println(3);
    }
    static{
        System.out.println(1);
    }
}
