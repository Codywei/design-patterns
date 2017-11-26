package Interpreter.Sample;
/**
 *    抽象表达式
 * */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
