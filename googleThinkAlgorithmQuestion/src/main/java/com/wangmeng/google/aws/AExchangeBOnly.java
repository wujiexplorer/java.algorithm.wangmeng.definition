package com.wangmeng.google.aws;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/7/5
 * TIME 20:37
 * Description no Description
 **/
public class AExchangeBOnly {

    public static void main(String[] args) {
        Integer a = 122;
        Integer b = 234;
        System.out.println("a=:"+a.toString()+"b=:"+b.toString());
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a=:"+a.toString()+"b=:"+b.toString());
    }
}
