package com.wangmeng.google.aws;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/7/4
 * TIME 22:04
 * Description no Description
 **/
public class BinaryCount {

    public static void main(String[] args) {
        int count = 0;
        int x =  3;
        while(x > 0){
            count ++;
            x &= (x-1);
        }
        System.out.println("count :"+count);
    }
}
