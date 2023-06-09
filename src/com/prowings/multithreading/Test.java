package com.prowings.multithreading;
class MyThread extends Thread{

}
public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        MyThread t=new MyThread();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
        t.start();
    }
}
