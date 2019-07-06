package com.wangmeng.google.aws;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/7/5
 * TIME 20:51
 * Description no Description
 **/
public class LeastBitOneCalculate {

    public static void main(String[] args) {
        int a = 17;
        a = a & ~(a-1);
        System.out.println(a);
    }
}
