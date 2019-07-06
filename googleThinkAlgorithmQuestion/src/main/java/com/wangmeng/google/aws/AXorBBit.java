package com.wangmeng.google.aws;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/7/5
 * TIME 21:08
 * Description no Description
 **/
public class AXorBBit {

    public static void main(String[] args) {
        System.out.println(swap(2,1,0));
        System.out.println(reverse_bit(2));
    }

    static int swap(int x,int i,int j){
        if(((x>>i) & 1) != ((x>>j) &1)){
            x ^= (1<<i) | (1<<j);
        }
        return x;
    }

    static int reverse_bit(int x){
        int j = count_bit(x)-1;
        int i =0;
        while(i<j){
            x=swap(x,i,j);
            i++;
            j--;
        }
        return x;
    }
    static int count_bit(int x){
        int count = 0;
        while(x != 0){
            count++;
            x >>>= 1;
        }
        return count;
    }
}
