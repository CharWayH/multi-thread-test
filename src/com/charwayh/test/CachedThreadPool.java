package com.charwayh.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author charwayH
 * 通过ExecutorService接口来创建线程对象
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }

}
