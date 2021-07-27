package com.charwayh;

/**
 * @author charwayH
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            if (i == 5){
                Thread2 thread2 = new Thread2();
                Thread thread = new Thread(thread2);
                thread.start();
                thread.join();
            }
        }

        System.out.println("主线程结束");
    }


}

class Thread2 implements Runnable{


    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello" + i);
        }
        System.out.println("子线程结束");
    }
}
