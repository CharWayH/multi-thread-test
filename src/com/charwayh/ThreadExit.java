package com.charwayh;

/**
 * @author charwayH
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        t1.start();
        // 10秒后退出线程
        Thread.sleep(1000 * 10);
        t1.setLoop(false);

    }
}

class T1 extends Thread{

    private int count = 0;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程T" + Thread.currentThread().getName() + "运行," + (++count) );
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
