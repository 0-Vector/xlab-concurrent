package com.penny.xlab.concurrent.ch01.sec06;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;

/**
 * getQueueLength() Returns an estimate of the number of threads waiting to acquire.
 * The value is only an estimate because the number of threads may
 * change dynamically while this method traverses internal data
 * structures.  This method is designed for use in monitoring of the
 * system state, not for synchronization control.
 *
 * Queries whether any threads are waiting to acquire. Note that
 * because cancellations may occur at any time, a {@code true}
 * return does not guarantee that any other thread will ever
 * acquire.  This method is designed primarily for use in
 * monitoring of the system state.
 */
@Slf4j
public class Service {
    private Semaphore semaphore = new Semaphore(1);
    public void testMethod() {
        try {
            semaphore.acquire();
            Thread.sleep(1000);
            log.info("还有大约{}个线程正在等待", semaphore.getQueueLength());
            log.info("是否还有线程正在等待信号量？{}", semaphore.hasQueuedThreads());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }

    }
}
