package com.charwayh.test;

/**
 * @author charwayH
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        // 下列代码优先执行，因为程序会同时运行两个方法
        System.out.println("Waiting for LiftOff.");
    }
}
