package com.penny.xlab.concurrent.ch01.sec04.d1;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;
/**
 * acquire()等待许可的情况下允许被中断
 */
@Slf4j
public class Service {
    private Semaphore semaphore = new Semaphore(1);
    public void testMethod() {
        try {
            semaphore.acquire();
            log.info("线程{}开始运行时间：{}", Thread.currentThread().getName(), System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
                String s = new String();
                Math.random();
            }
            semaphore.release();
            log.info("线程{}结束运行时间：{}", Thread.currentThread().getName(), System.currentTimeMillis());
        } catch (InterruptedException e) {
            log.error("==> 进入catch(){}", e);
            e.printStackTrace();
        }
    }
}
