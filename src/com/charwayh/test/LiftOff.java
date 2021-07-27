package com.charwayh.test;

import java.util.concurrent.TimeUnit;

/**
 * @author charwayH
 */
public class LiftOff implements Runnable {
    /**
     * countDown 倒计时开始数字
     * taskCount 任务数
     * id        任务id
     */
    int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "),";
    }

    @Override
    public void run() {
       while (countDown-- > 0){
           System.out.print(status());
//           Thread.yield();
           try {
               TimeUnit.MILLISECONDS.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
