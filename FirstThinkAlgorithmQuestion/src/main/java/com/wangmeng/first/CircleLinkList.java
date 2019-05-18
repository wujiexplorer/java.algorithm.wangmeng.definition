package com.wangmeng.first;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/5/12
 * TIME 12:38
 * Description no Description
 **/
public class CircleLinkList {

    /**
     * 参与游戏人数
     */
    private int playBoys;
    /**
     * 从第几个开始数
     */
    private int startIndex;
    /**
     * 数几个小孩退出
     */
    private int countNum;
    //首个小孩
    private Child firstChild;
    //标识当前小孩
    private Child temp;
    /**
     *
     * @param playBoys 参与游戏人数
     * @param startIndex 从第几个开始数
     * @param countNum 数几个小孩退出
     */
    public CircleLinkList(int playBoys, int startIndex, int countNum) {
        super();
        this.playBoys = playBoys;
        this.startIndex = startIndex;
        this.countNum = countNum;
        createList();
    }
    /**
     * 创建循环链表
     */
    private void createList() {
        for (int i = 1; i <=playBoys; i++) {
            if (i==1) {//第一个小孩
                Child child=new Child(i);
                this.firstChild=child;
                this.temp=child;
            }else if (i==playBoys) {//最后一个小孩
                Child child=new Child(i);
                this.temp.nextChild=child;
                this.temp=child;
                this.temp.nextChild=this.firstChild;//最后一个小孩的下一个小孩指向第一个小孩
            }else {
                Child child=new Child(i);
                this.temp.nextChild=child;
                this.temp=child;
            }
        }
    }

    /**
     * 玩游戏
     */
    public void play(){
        temp=firstChild;
        //先找到从第几个小孩开始数
        for (int i = 1; i < startIndex; i++) {
            temp=temp.nextChild;
        }
        System.out.println("游戏开始,从第"+temp.no+"个小孩开始数,数到第"+this.countNum+"个小孩退出游戏");
        while (this.playBoys>1) {
            //找到要退出游戏的前一个小孩
            for (int i = 1; i < countNum-1; i++) {
                temp=temp.nextChild;
            }
            //当前temp是要退出的前一个小孩
            Child leaveChild=temp.nextChild;//要退出的小孩
            System.out.println("当前退出的小孩编号为:" +leaveChild.no);
            temp.nextChild=leaveChild.nextChild;
//            if (leaveChild.no==firstChild.no) {//如果要退出的小孩是第一个小孩,则将第一个小孩重置为退出小孩的下一个小孩
//                this.firstChild=leaveChild.nextChild;
//            }
            temp=temp.nextChild;
            this.playBoys--;//玩游戏人数少一个
        }
        System.out.println("最后剩下的小孩是:"+ temp.no);
    }
}
