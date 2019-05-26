package com.penny.xlab.concurrent.ch01.sec03;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;

@Slf4j
public class Service {

    private Semaphore semaphore = new Semaphore(10);

    public void testMethod() {
        try {
            /*
             * acquire(int permits)
             * 每调用一次此方法获取permits个许可
             */
            semaphore.acquire(2);
            log.info("线程{}的开始运行时间为{}", Thread.currentThread().getName(), System.currentTimeMillis());
            Thread.sleep(5000);
            log.info("线程{}的运行结束时间为{}", Thread.currentThread().getName(), System.currentTimeMillis());
            semaphore.release(2);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
