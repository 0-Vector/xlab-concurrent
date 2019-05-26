package com.penny.xlab.concurrent.ch01.sec01;

public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
