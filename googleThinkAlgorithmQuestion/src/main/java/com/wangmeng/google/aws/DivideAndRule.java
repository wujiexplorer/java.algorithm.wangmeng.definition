package com.wangmeng.google.aws;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/5/26
 * TIME 17:42
 * Description no Description
 **/
public class DivideAndRule {

    public static void main(String[] args) {
        Integer S[] = {1,3,8,9,10,34,9,5};
        Integer profit = Integer.MIN_VALUE;
        Integer size = S.length /2 ;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(S[j] - S[i] > profit){
                    profit = S[j] -S[i];
                }
            }
        }

        for(int i=size;i<S.length;i++){
            for(int j = i+1;j<S.length;j++){
                if(S[j] - S[i] >profit){
                    profit = S[j] -S[i];
                }
            }
        }
        Integer temp = S[0];
        for(int i= 0 ;i<size ;i++){
            if(temp > S[i]){
                temp = S[i];
            }
        }
        Integer tempMax = S[size];
        for(int i=size;i<S.length;i++){
            if(tempMax < S[i]){
                tempMax = S[i];
            }
        }
        if(profit < tempMax - temp){
            profit = tempMax -  temp;
        }
        System.out.println("result profit:"+profit);
    }
}
