package Builder.Sample;
/**
 * 监工（只调用在builder接口中声明的方法）
 * */
public class Director {
    private Builder builder;
    public Director(Builder builder) {              // 因为接收的参数是Builder类的子类（Director并不知道调用的是哪个类）
        this.builder = builder;                     // 所以可以将其保存在builder字段中
    }
    public void construct() {                       // 编写文档
        builder.makeTitle("Greeting");              // 标题
        builder.makeString("从早上至下午");         // 字符串
        builder.makeItems(new String[]{             // 条目
            "早上好。",
            "下午好。",
        });
        builder.makeString("晚上");                 // 其他字符串
        builder.makeItems(new String[]{             // 其他条目
            "晚上好。",
            "晚安。",
            "再见。",
        });
        builder.close();                            // 完成文档
    }
}
