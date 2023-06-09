package com.prowings.multithreading;

class ThreadA {
    public static void main(String... args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b){
            System.out.println("main method calling wait() method...");
            b.wait();
            System.out.println("main got notification...");
            System.out.println(b.total);
        }
    }
}
class ThreadB extends  Thread{
    int total=0;
    public void run()
    {
      synchronized (this){
          System.out.println("child starting calculation...");
          for (int i=1;i<=100;i++){
              total=total+i;
          }
          System.out.println("child giving notification...");
          this.notify();
      }
    }
}
