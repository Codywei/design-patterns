package Mediator.Sample;
/**
 * 同事
 * */
public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    public abstract void setColleagueEnabled(boolean enabled);
}
