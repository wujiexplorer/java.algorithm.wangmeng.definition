package com.wangmeng.google.aws;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/7/6
 * TIME 7:35
 * Description no Description
 **/
public class ViolenceEnumerationPrimes {

    public static void main(String[] args) {
        System.out.println(getPrimes(100));
    }

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getPrimes(int n){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
}
