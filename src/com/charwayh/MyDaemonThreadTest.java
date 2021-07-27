package com.charwayh;

/**
 * @author charwayH
 */
public class MyDaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("贾乃亮在开视频直播");
            Thread.sleep(1000);
        }
    }
}


class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for(;;){
            System.out.println("PG ONE和李晓璐在做头发...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
