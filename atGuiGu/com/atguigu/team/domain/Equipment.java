package com.atguigu.team.domain;

public interface Equipment {
    public abstract String getDescription(); //public abstract可以省略；jdk7中接口中只能定义抽象方法，jdk8加了默认方法和静态方法
    //public abstract可以省略
    //jdk7 接口中定义抽象方法
    //jdk8 +默认方法 和 静态方法
}
