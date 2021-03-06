package Singleton.Sample;
/**
 饿汉式加载
 * */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    private Singleton() {                                 
        System.out.println("生成了一个实例。");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
