package com.penny.xlab.concurrent.ch01.sec06;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread myThread = new MyThread(service);
        myThread.start();
        MyThread[] myThreads = new MyThread[4];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread(service);
            myThreads[i].start();
        }
    }
}
