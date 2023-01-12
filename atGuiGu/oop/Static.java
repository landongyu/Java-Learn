package oop;
public class Static {
    // 把和对象无关，只和类相关的，成为静态
    // 和类相关的属性称之为静态属性 （在属性前加static）
    // 和类相关的方法称之为静态方法 （在方法前加static）
    // 说白了是：定义了一个类，这个类里面的属性和方法都固定了，都static了。如果定义一个类，这个类里面的属性或者方法很固化，就可以用static!
    public static void main(String[] args) {
        Bird.fly();
        System.out.println(Bird.type);
    }
}

class Bird {
    static String type = "bird";
    static void fly() {
        System.out.println("fly");
    }
}
