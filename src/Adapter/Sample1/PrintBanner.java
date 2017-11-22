package Adapter.Sample1;
/**
 * 适配器
 * */
public class PrintBanner extends Banner implements Print {//继承了被适配的类，实现了新方法的接口
    public PrintBanner(String string) {
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}
