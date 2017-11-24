package AbstractFactory.Sample.factory;
/**
 * 抽象零件的父类
 * */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
