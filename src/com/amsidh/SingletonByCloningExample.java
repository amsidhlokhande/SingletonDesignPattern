package com.amsidh;

public class SingletonByCloningExample {
  public static void main(String[] args) throws CloneNotSupportedException {
    SingletonClass obj = SingletonClass.SINGLETON_CLASS;
    System.out.println("Before Cloning =" + obj.hashCode());
    obj.display();
    SingletonClass obj2 = (SingletonClass) obj.clone();

    System.out.println("After Cloning =" + obj2.hashCode());
    obj2.display();
  }
}
