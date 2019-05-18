package com.wangmeng.serialVersionUID;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA
 * USER Administrator
 * DATE 2019/5/18
 * TIME 13:09
 * Description no Description
 **/

public class Animal {

    //private static final long serialVersionUID = 1L;

    private String name;

    private String no;

    private String wm;

    private Long age;

    private Integer sex;


    private String wy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getWm() {
        return wm;
    }

    public void setWm(String wm) {
        this.wm = wm;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getWy() {
        return wy;
    }

    public void setWy(String wy) {
        this.wy = wy;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", wm='" + wm + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", wy='" + wy + '\'' +
                '}';
    }
}
