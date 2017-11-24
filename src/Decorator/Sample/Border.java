package Decorator.Sample;
/**
 * 装饰物
 * */
public abstract class Border extends Display {
    protected Display display;          // 表示被装饰物（聚合体现在这里）
    protected Border(Display display) { // 在生成实例时通过参数指定被装饰物
        this.display = display;
    }
}
