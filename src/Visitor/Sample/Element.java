package Visitor.Sample;
/**
 * 元素，声明接受访问者的visit方法
 * */
public interface Element {
    public abstract void accept(Visitor v);
}
