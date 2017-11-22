package Prototype.Sample;

import Prototype.Sample.framework.*;

public class Main {
    public static void main(String[] args) {
        // 准备,生成使用者实例和三个具体原型的实例
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        //将实例和对应的别名存在hashmap中，之后根据别名找实例
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成，使用者调用创建方法克隆相应的实例
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
