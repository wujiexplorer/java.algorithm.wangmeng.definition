package com.wangmeng.google.aws;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/7/5
 * TIME 21:43
 * Description no Description
 **/
public class FindMinAbs {

    public static void main(String[] args) {
        System.out.println(find_min_abs(3));
    }

    static int find_min_abs(int x){
        int i = 0;
        if(i<count_bit(x)-1){
            if(swap_bit(x,i,i+1) != x){
                return swap_bit(x,i,i+1);
            }
            i++;
        }
        return x;
    }

    static int count_bit(int x){
        int count = 0;
        while (x != 0){
            x >>>= 1;
            count++;
        }
        return count;
    }

    static int swap_bit(int x,int i,int j){
        if(((x>>i) & 1) != ((x>>j) &1 )){
            x ^= (1<<i)|(1<<j);
        }
        return x;
    }
}
