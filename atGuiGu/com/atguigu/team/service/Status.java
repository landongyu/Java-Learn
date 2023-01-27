package com.atguigu.team.service;
/* 表示员工状态：free, busy, vocation
* */
public class Status {
    private final String NAME;//一旦赋值之后，不可修改，所以加了final
    private Status(String name) { //类的构造器私有化一下，不允许在外面造对象了
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    public String getNAME() { //因为是final，所以没法改了，没有set方法了
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }

}
