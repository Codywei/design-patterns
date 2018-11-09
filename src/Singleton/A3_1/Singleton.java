package Singleton.A3_1;
/**
 懒汉式加载（线程不安全）
 * */
public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("生成了一个实例。");
        slowdown();                             
    }
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    private void slowdown() {                   
        try {                                   
            Thread.sleep(1000);                 
        } catch (InterruptedException e) {      
        }                                       
    }                                           
}
