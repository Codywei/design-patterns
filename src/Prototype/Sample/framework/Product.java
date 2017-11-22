package Prototype.Sample.framework;
import java.lang.Cloneable;
/**
 * 原型，代码中没有出现具体类（非紧耦合），继承了Cloneable接口
 * */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
