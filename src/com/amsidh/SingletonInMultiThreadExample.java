package com.amsidh;

public class SingletonInMultiThreadExample {
  public static void main(String[] args) {
    Thread t1 = getThread("Thread 1 =");
    Thread t2 = getThread("Thread 2 =");
    Thread t3 = getThread("Thread 3 =");
    Thread t4 = getThread("Thread 4 =");

    t1.start();
    t2.start();
    t3.start();
    t4.start();


  }

  private static Thread getThread(String s) {
    return new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        SingletonClass obj = SingletonClass.SINGLETON_CLASS;
        System.out.println(s + obj.hashCode());
        try {
          Thread.sleep(1000L);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
  }
}
