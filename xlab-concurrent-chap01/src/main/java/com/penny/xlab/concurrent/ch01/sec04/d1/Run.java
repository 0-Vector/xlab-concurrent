package com.penny.xlab.concurrent.ch01.sec04.d1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Run {
    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000L);
        b.interrupt();
        log.info("main中断了b线程！");
    }

}
