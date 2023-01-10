package oop;

public class Abstract {
    public static void main(String[] args) {
        //抽象类： 不完整的类
        //         abstract class 类名
        //抽象方法： 只有声明，没有实现的方法
        //         abstract 返回值类型 方法名 （参数）

        //分析问题：对象（具体） => 类 （抽象）
        //编写代码：类 （抽象） => 对象（具体）

        // 一个类含有抽象方法，就是抽象类
        // 抽象类无法直接构建对象，通过子类构建对象
        // 子类继承抽象类，需要重写抽象方法，将方法补充完整
        // abstract和final不能同时使用 （在类和方法都）
        Beagle lia = new Beagle();
        lia.sound();
    }
}

abstract class Dog {
    public abstract void sound();
}

class Beagle extends Dog {
    public void sound() {
        System.out.println("wer!wer!wer!wer!");
    }
}


