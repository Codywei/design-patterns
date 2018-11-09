package Singleton.Q3;
/**
 懒汉式加载（线程不安全）
 * */
public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("生成了一个实例。");
    }
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
