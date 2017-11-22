package Iterator.Sample;
/**
 * 迭代器
 * */
public interface Iterator {
    public abstract boolean hasNext();//判断是否还有下一个元素
    public abstract Object next();//获取下一个元素
}
