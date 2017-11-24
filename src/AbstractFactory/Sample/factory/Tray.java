package AbstractFactory.Sample.factory;
import java.util.ArrayList;
/**
 * 抽象零件，以ArrayList来添加tray和link
 * */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}
