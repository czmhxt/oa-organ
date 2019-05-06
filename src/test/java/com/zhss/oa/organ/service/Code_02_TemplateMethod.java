package com.zhss.oa.organ.service;

public class Code_02_TemplateMethod {

    // 不能给子类实现
    public final void print(String msg){
        System.out.println("################");
        wrapPrint(msg);
        System.out.println("################");
    }

    // 给子类实现(也可以写成抽象方法，子类必须实现)
    protected void wrapPrint(String msg){

    }

    public static void main(String[] args){

        Code_02_TemplateMethod t1 = new Code_02_TemplateMethod(){
            @Override
            protected void wrapPrint(String msg) {
                System.out.println("**" + msg + "**");
            }
        };
        t1.print("Hello Thread");

        Code_02_TemplateMethod t2 = new Code_02_TemplateMethod(){
            @Override
            protected void wrapPrint(String msg) {
                System.out.println("++" + msg + "++");
            }
        };
        t2.print("Hello Thread");
    }
}