package com.example.lester.juc.conc0303;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Homework05 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        long start = System.currentTimeMillis();
        myThread.start();
        // 确保  拿到result 并输出
        System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");
        // 然后退出main线程
        myThread.stop();
    }

    static class MyThread extends Thread {
        int result = sum(); //这是得到的返回值
    }


    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if (a < 2)
            return 1;
        return fibo(a - 1) + fibo(a - 2);
    }


}
