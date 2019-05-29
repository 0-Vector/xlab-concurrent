package com.penny.xlab.concurrent.ch01.sec05.d1;

import java.util.concurrent.Semaphore;

/**
 * availablePermits() 返回Semaphore对象中当前可用的许可数
 */
public class Service {
    private Semaphore semaphore = new Semaphore(10);
     public void testMethod() {
         try {
             semaphore.acquire();
             System.out.println(semaphore.availablePermits());
             System.out.println(semaphore.availablePermits());
             System.out.println(semaphore.availablePermits());
         } catch (InterruptedException e) {
             e.printStackTrace();
         } finally {
             semaphore.release();
         }

     }
}
