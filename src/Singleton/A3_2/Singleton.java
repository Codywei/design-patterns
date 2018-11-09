package Singleton.A3_2;
/**
 懒汉式加载（线程安全，但是用synchronized太笨重）
 * */
public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("生成了一个实例。");
        slowdown();                             
    }
    public static synchronized Singleton getInstance() {
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
