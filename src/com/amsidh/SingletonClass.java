package com.amsidh;

import java.io.*;

public final class SingletonClass implements Serializable, Cloneable {
    public static final SingletonClass SINGLETON_CLASS = getInstance();

    private SingletonClass() {
        System.out.println("SingletonClass constructor called!!");
    }

    private static SingletonClass getInstance() {
        if (SINGLETON_CLASS == null) {
            synchronized (SingletonClass.class) {
                return new SingletonClass();
            }
        }
        return SINGLETON_CLASS;
    }


    public void display() {
        System.out.println("SingletonClass =" + this.hashCode());
    }

    //readresolve returns INSTANCE after deserialization
    private Object readResolve() throws ObjectStreamException {
        return SingletonClass.SINGLETON_CLASS;
    }

    //clone returns INSTANCE after cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return SingletonClass.SINGLETON_CLASS;
    }
}
