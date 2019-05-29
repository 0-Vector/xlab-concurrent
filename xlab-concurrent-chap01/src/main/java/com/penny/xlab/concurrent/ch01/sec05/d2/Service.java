package com.penny.xlab.concurrent.ch01.sec05.d2;

import java.util.concurrent.Semaphore;

/**
 * drainPermits() 获取并返回Semaphore对象中当前立即可用的所有许可个数，并
 * 将许可个数置0
 */
public class Service {
    private Semaphore semaphore = new Semaphore(10);
     public void testMethod() {
         try {
             semaphore.acquire();
             System.out.println(semaphore.availablePermits());
             System.out.println(semaphore.drainPermits() + " " + semaphore.availablePermits());
             System.out.println(semaphore.drainPermits() + " " + semaphore.availablePermits());
             System.out.println(semaphore.drainPermits() + " " + semaphore.availablePermits());
         } catch (InterruptedException e) {
             e.printStackTrace();
         } finally {
             semaphore.release();
         }

     }
}
