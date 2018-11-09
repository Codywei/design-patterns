package AbstractFactory.A2;

import AbstractFactory.A2.factory.*;
/**
 * 该类没有使用任何具体零件、产品或者工厂
 * */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
        Page page = factory.createYahooPage();
        page.output();
    }
}
