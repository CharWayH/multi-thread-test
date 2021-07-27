package com.charwayh;

/**
 * @author charwayH
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // 获取当前计算机CPU核数
        int i = runtime.availableProcessors();
        System.out.println(i);
    }
}
