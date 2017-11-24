package Strategy.Sample;
/**
 * 策略
 * */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
