package com.penny.xlab.concurrent.ch01.sec04;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;

/**
 * new Semaphore(permits)
 * 中permits并不是最终的许可数量，仅仅是初始的状态值
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        try {
            Semaphore semaphore = new Semaphore(5);
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            log.info("剩余许可：{}", semaphore.availablePermits());
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            log.info("剩余许可：{}", semaphore.availablePermits());
            semaphore.release(4);
            log.info("剩余许可：{}", semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
