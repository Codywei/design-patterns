package Bridge.Sample;
/**
 * 抽象化
 * */
public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl) {//此处传入的应该是Display的实现子类
        this.impl = impl;
    }
    public void open() {
        impl.rawOpen();
    }//有点像适配器模式，新瓶装旧酒，而且聚合了旧方法的类
    public void print() {
        impl.rawPrint();
    }
    public void close() {
        impl.rawClose();
    }
    public final void display() {
        open();
        print();                    
        close();
    }
}
