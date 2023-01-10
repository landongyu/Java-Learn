package oop;
public class Interface {


//     1. 接口用interface定义
//     2. 在java中，接口和类是并列的结构
//     java的类是单继承，但有时需要有一个类继承多个类，有接口，就有多重继承的效果
//     有时从几个类中抽取一些共同的行为特征
//     3. 如何定义接口： 定义接口中的成员
//          3.1 jdk7及以前：接口中只能定义全局常量和抽象方法
//           --> 全局常量： public static final
//           --> 抽象方法： public abstract
//          3.2 jdk8: 除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
//     4. 接口中不能定义构造器，意味着接口不能实例化
//     5. 在java开发中，接口通过类去实现（implement）的方式来使用
//        如果实现类覆盖了接口中的所有抽象方法，则此实现类可以实例化
//        如果实现类没有覆盖接口中的所有抽象方法，则此实现类仍为一个抽象类
//     6. java类可以实现多个接口(就跟父类内感觉似的)，弥补了但继承性的局限性
//        class AA extends BB implements CC, DD, EE
//     7. 类实现接口，类继承类，接口和接口之间可以继承，而且可以多继承
//     8. 接口的具体使用，体现多态性
//     9. 接口，实际上可以看作规范，如果你要飞，则必须能实现flyable
//   面试题：抽象类和接口有哪些异同？都不能实例化对象

    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plane plane = new Plane();
        plane.fly();
    }
}

interface Flyable {
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();
    //省略了public abstract
    void stop();
}

class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}