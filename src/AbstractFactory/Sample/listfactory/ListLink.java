package AbstractFactory.Sample.listfactory;
import AbstractFactory.Sample.factory.*;
/**
 * 具体产品
 * */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
