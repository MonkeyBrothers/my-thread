package com.monkey.thread;


public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("继承Thread");
    }
}
