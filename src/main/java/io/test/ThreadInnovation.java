package io.test;


public class ThreadInnovation {

    public static void main(String args[]) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is:"+Thread.currentThread().getName());

            }
        }).start();
    }
}