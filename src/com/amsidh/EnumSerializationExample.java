package com.amsidh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSerializationExample {
  public static void main(String[] args) throws IOException {
    SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
    System.out.println("Before writing the Enum to Serialization =" + singletonEnum.hashCode());
    singletonEnum.display();
    File file = new File("singleton-enum.tmp");
    file.createNewFile();

    ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file));
    writer.writeObject(singletonEnum);
    writer.flush();
    writer.close();
    System.out.println("===========================");

    for (int i = 0; i < 10; i++) {
      readSingletonSerializedClass(file);
    }

  }

  private static void readSingletonSerializedClass(File file) {
    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
      SingletonEnum singletonEnum2 = (SingletonEnum) inputStream.readObject();
      System.out.println("After reading the enum object =" + singletonEnum2.hashCode());
      singletonEnum2.display();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
