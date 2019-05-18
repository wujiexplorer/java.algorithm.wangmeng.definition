package com.wangmeng.serialVersionUID;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/5/18
 * TIME 13:13
 * Description no Description
 **/
public class TestAnimalRead {

    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream = new FileInputStream("foo");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //根据实体类Animal编译后的serialVersionUID,找到实体类，并反序列化
        //如果write与read配对，无论如何都是正确的
        Animal animal = (Animal)objectInputStream.readObject();
        System.out.println("animal:"+animal.toString());
        objectInputStream.close();
        fileInputStream.close();
    }
}
