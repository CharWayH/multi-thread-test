package com.charwayh.test;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author charwayH
 */
public class SleepTest {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exec.execute(new RandSleepThread());
        }
        exec.shutdown();
    }
}

/**
 * 线程随机N秒后退出
 */
class RandSleepThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始了");
        int i = new Random().nextInt(60);
        try {
            TimeUnit.SECONDS.sleep(i);
            System.out.println(Thread.currentThread().getName() + " :睡眠了" + i + "秒程序退出了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
