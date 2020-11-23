package com.monkey.thread;


import java.util.concurrent.TimeUnit;

public class MyRunnableTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--------开始调用线程--------");
        Thread thread= new Thread(new MyRunnable());
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("--------调用线程结束--------");
    }

}
