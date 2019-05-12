package com.wangmeng.first;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/5/12
 * TIME 12:37
 * Description no Description
 **/
public class Test {

    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        CircleLinkList game=new CircleLinkList(10000, 99, 533);
        long endtime=System.currentTimeMillis();
        game.play();
        long time2=System.currentTimeMillis();
        System.out.println("创建链表用了"+(endtime-starttime)/1000.0+"秒");
        System.out.println("玩游戏共用了"+(time2-starttime)/1000.0+"秒");
    }
}
