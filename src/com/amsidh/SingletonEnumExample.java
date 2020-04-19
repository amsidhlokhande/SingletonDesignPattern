package com.amsidh;

public class SingletonEnumExample {
  public static void main(String[] args) {
    SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
    System.out.println(singletonEnum1.hashCode());
    singletonEnum1.display();
    SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
    System.out.println(singletonEnum2.hashCode());
    singletonEnum2.display();
  }
}
