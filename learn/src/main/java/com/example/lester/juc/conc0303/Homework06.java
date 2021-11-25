package com.example.lester.juc.conc0303;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Homework06 {

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            try {
                long start = System.currentTimeMillis();
                int result = sum(); //这是得到的返回值
                System.out.println("异步计算结果为：" + result);
                // 确保  拿到result 并输出
                System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("子线程Id" + Thread.currentThread().getName());
            System.out.println("子线程Id" + Thread.currentThread().getId());
        }
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
