package Adapter.Sample1;
/**
 * 被适配
 * */
public class Banner {//两个方法需要被适配到新方法里
    private String string;
    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
