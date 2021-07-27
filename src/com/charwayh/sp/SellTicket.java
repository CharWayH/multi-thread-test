package com.charwayh.sp;

/**
 * @author charwayH
 *
 * 使用多线程，模拟三个窗口同时售票
 */
public class SellTicket {
    public static void main(String[] args) {
        SellThread02 sellThread = new SellThread02();

        Thread t1 = new Thread(sellThread);
        Thread t2 = new Thread(sellThread);
        Thread t3 = new Thread(sellThread);
        // 启动售票线程
        t1.start();
        t2.start();
        t3.start();


    }
}
//
//class SellThread01 extends Thread{
//    // 让多个线程共享ticketNum
//    private static int ticketNum = 100;
//
//    @Override
//    public void run() {
//        while (true){
//            if(ticketNum <= 0){
//                System.out.println("票已卖完");
//                break;
//            }
//
//        try {
//            Thread.sleep(50);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票"
//                + "，剩余票数为" + (--ticketNum));
//        }
//    }
//}


class SellThread02 implements Runnable{

    boolean loop = true;

    // 让多个线程共享ticketNum
    private static int ticketNum = 100;

    public synchronized boolean sell(){
        if(ticketNum <= 0){
            System.out.println("票已卖完");
            return false;
        }

        try {
            Thread.sleep(50);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票"
                + "，剩余票数为" + (--ticketNum));
        return true;

    }

    @Override
    public  void run() {
        while (loop){
            loop = sell();
        }
    }
}