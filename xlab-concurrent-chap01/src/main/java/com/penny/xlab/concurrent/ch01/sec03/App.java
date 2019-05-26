package com.penny.xlab.concurrent.ch01.sec03;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA[] threadAS = new ThreadA[10];
        for (int i = 0; i < threadAS.length; i++) {
            threadAS[i] = new ThreadA(service);
            threadAS[i].start();
        }
    }
}
