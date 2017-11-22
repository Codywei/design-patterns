package Adapter.Sample2;
/**
 * 适配器（委托）
 * */
public class PrintBanner extends Print {//继承含新方法的抽象类
    private Banner banner;//将 被适配的类 聚合
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}
