package AbstractFactory.Sample.factory;
/**
 * 抽象工厂
 * */
public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();//调用class类的forName方法来动态地获取类信息，使用newinstance方法生成类的实例
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到 " + classname + "类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
