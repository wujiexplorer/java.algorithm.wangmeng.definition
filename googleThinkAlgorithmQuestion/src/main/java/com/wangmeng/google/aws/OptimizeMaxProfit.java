package com.wangmeng.google.aws;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/5/26
 * TIME 19:52
 * Description no Description
 **/
public class OptimizeMaxProfit {

    public static void main(String[] args) {
        Integer S[] = {1,3,8,9,10,34,9,5};
        Integer minProfit = S[0];
        Integer maxProfit = minProfit;
        for(int N =1;N<S.length;N++){
            if(minProfit > S[N-1]){
                minProfit = S[N-1];
            }
            if(S[N] - minProfit > maxProfit){
                maxProfit = S[N] - minProfit;
            }
        }
        System.out.println("Result Profit:"+maxProfit);
    }
}
