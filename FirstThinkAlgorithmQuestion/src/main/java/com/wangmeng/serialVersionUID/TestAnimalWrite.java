package com.wangmeng.serialVersionUID;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/5/18
 * TIME 13:10
 * Description no Description
 **/
public class TestAnimalWrite {

    public static void main(String[] args) throws Exception{
        Animal animal = new Animal();
        FileOutputStream fileOutputStream = new FileOutputStream("foo");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        //序列化效率高些，如果没有序列化，字符流--》字节流也可以存储，网络传输
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(animal);
        bufferedWriter.write(animal.toString());
       // objectOutputStream.close();

    }
}
