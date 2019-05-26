package com.penny.xlab.concurrent.ch01.sec02;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;

@Slf4j
public class Service {

    /*
     * 构造方法
     * new Semaphore(int permits)
     * 同一时间最多允许permits个线程执行acquire和release之间的业务代码
     */
    private Semaphore semaphore = new Semaphore(2);

    public void testMethod() {
        try {
            semaphore.acquire();
            log.info("线程{}的开始运行时间为{}", Thread.currentThread().getName(), System.currentTimeMillis());
            Thread.sleep(5000);
            log.info("线程{}的运行结束时间为{}", Thread.currentThread().getName(), System.currentTimeMillis());
            semaphore.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
