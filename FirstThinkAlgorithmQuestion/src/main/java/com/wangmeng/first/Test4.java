package com.wangmeng.first;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/5/12
 * TIME 13:39
 * Description no Description
 **/
public class Test4 {

    public static void main(String[] args) throws InterruptedException {
        long starttime = System.currentTimeMillis();
        int childrens=10000;//玩游戏的小孩总数
        int countNum=533;//数第几个小孩退出游戏
        int startNum=99;//开始从第几个人开始数
        int count=1;//计数器
        int [] arrays=new int[childrens];
        for (int i = 0; i < arrays.length; i++) {//为数组初始化值
            arrays[i]=1;
        }
        loop:while(true){
            for (int i = 0; i < arrays.length; i++) {
                if (i<startNum-1) {//第一次循环找到从第几个小孩开始数数
                    continue;
                }
                startNum=0;//开始后将startNum清零
                if (arrays[i]!=0) {//值为0的表示已经退出游戏
                    if (count%countNum==0) {//数到的小孩退出游戏
                        if (childrens==1) {
                            System.out.println("游戏胜利的小孩编号为:"+(i+1));
                            break loop;
                        }
                        arrays[i]=0;//退出游戏的小孩值设为0
                        count=0;//计数器清零,重新计数
                        childrens--;//玩游戏的人数减一
                        System.out.println("编号为"+(i+1)+"的小孩退出游戏");
                    }
                    count++;
                }
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("玩游戏共用了" + (time2 - starttime)/1000.0 + "秒");
    }

}
