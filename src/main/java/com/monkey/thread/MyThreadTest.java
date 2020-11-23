package com.monkey.thread;


import java.util.concurrent.TimeUnit;

public class MyThreadTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--------开始调用线程--------");
        MyThread thread= new MyThread();
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("--------调用线程结束--------");
    }
}
