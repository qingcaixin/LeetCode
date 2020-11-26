package com;

/**
 * @author wangxin
 * @data 2020/11/26 14:01
 */
public class LambdaDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("练习用的类");
            }
        });

        //lambda
        new Thread(() -> System.out.println("连用的"));
    }
}
