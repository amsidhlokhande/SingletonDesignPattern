package com.amsidh;

// Singleton feature of a class can be broken by reflection API. To overcome this problem we can
// use Enum way of creating singleton class which does not provide a constructor call to user.
//Inbuilt constructor is there but it does not allow to the user to call.
public enum SingletonEnum {
    INSTANCE;

    SingletonEnum() {
        System.out.println("SingletonEnum constructor called");
    }

    public void display() {
        System.out.println(this.hashCode());
    }

}
