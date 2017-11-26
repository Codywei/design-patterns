package Facade.Sample;

import Facade.A2.pagemaker.PageMaker;
/**
 * 请求者
 * */
public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
