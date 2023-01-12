package oop;
//  接口的主要用途就是被实现类去实现（面向接口编程）「项目需求多变，我们需要以不变应万变，此处不变就是指：规范」
//  接口使用上满足多态性
//  接口实际上就是定义了一种规范
//  开发中，体会面向接口编程

public class Interface_Example_USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        //1. 创建了 接口的非匿名实现类 的 非匿名对象
        Flash flash = new Flash();
        com.transferData(flash); //这里实际new的是一个实现类，这个格式就体现了多态性；接口自己不能实例化对象，必须通过多态性的方式去使用
        //2. 创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());
        //3. 创建了接口的匿名实现类的非匿名实现对象
        USB phone = new USB() { //这里new USB(),是匿名实现类
            public void start() {
                System.out.println("手机开始工作");
            }
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        com.transferData(phone);
        //4. 创建了接口的匿名实现类的匿名对象
        com.transferData(phone);
        com.transferData(new USB(){
            public void start() {
                System.out.println("mp3开始工作");
            }
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });
    }
}

class Computer {
    public void transferData(USB usb) { //声明的是实现类
        usb.start();
        System.out.println("具体传输数据的细节");
        usb.stop();
    }
}
interface USB {
    //常量：定义了长，宽，最大，最小的传输速度
    //java中的接口定义了一堆常量和一堆功能
    //实现类的集合叫做驱动：驱动具体实现类
    void start();
    void stop();
}

class Flash implements USB { //FlashU盘实现USB
    public void start() {
        System.out.println("U盘开始工作");
    }
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB {
    public void start() {
        System.out.println("打印机开始工作");
    }
    public void stop() {
        System.out.println("打印机结束工作");
    }
}