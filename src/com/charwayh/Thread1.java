package com.charwayh;

/**
 * @author charwayH
 */
public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        // 启动线程执行run方法中的内容
        cat.start();
        for (int i = 0; i < 60; i++) {
            Thread.sleep(1000);
            System.out.println("主线程" + i + "线程名:" + Thread.currentThread());
        }
    }
}

class Cat extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程" + i  + "线程名:" + Thread.currentThread());
            if (i == 80) {
                break;
            }
            i++;
        }
    }
}


