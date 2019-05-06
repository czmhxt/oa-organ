package com.zhss.oa.organ.service;

public class czmTest {

    public static void main(String[] args) {

        //一边从数据库读取，一边写入文件

        new Thread("Read-Thread") {
            @Override
            public void run() {
                readFromData();
            }
        }.start();//start()方法是立刻返回的，不会阻塞

        new Thread("Write-Thread") {
            @Override
            public void run() {
                writeToFile();
            }
        }.start(); //只有调用start()方法才是线程,不然只是一个普通的类
    }


    static void readFromData() {
        try {
            println("Begin read data from db......");
            Thread.sleep(1000 * 5L);
            println("After read data !");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("Read data successfully!");
    }

    static void writeToFile() {
        try {
            println("Begin write data to File.......");
            Thread.sleep(1000 * 5L);
            println("After write date !");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("Write data successfully!");
    }

    static void println(String msg) {
        System.out.println(msg);
    }
}