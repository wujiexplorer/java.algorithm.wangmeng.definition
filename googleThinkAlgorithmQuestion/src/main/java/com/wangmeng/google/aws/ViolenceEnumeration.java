package com.wangmeng.google.aws;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/5/26
 * TIME 17:00
 * Description no Description
 **/
public class ViolenceEnumeration {

    public static void main(String[] args) {
        Integer S[] = {1,3,8,9,10,34,9,5};
        Integer profit = Integer.MIN_VALUE;
        for(int i=0;i<S.length;i++){
            for(int j = i+1;j<S.length;j++){
                if(S[j] - S[i] >profit){
                    profit = S[j] - S[i];
                }
            }
        }
        System.out.println("result profit :"+profit);
    }
}
