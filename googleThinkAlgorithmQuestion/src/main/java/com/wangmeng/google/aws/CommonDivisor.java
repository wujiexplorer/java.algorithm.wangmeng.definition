package com.wangmeng.google.aws;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/7/5
 * TIME 22:37
 * Description no Description
 **/
public class CommonDivisor {

    public static void main(String[] args) {
        System.out.println(gcd(12,7));
    }

    private static int gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        int d = a % b;
        return gcd(b,d);
    }
}
