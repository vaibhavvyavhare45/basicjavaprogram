package com.prowings.multithreading;

class  MyRunnable implements  Runnable{
    private String name;
    public MyRunnable(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(name+" running is "+i);
            Thread.yield();
        }
        System.out.println(name+" finish its execution");
    }
}
public class JoinAndYieldMethodScenario {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new MyRunnable("thread1"));
        Thread t2=new Thread(new MyRunnable("thread2"));
        Thread t3=new Thread(new MyRunnable("thread3"));
        t1.start();
        t2.start();
        t3.start();
        t1.join();//main thread  wait for t1 to finish
        t2.join();//main thread wait for t2 to  finish
        t3.join();//main thread wait for t3 to finish
        System.out.println("all thread have finish their execution");
    }
}
