package State;

public interface Context {
    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String mgs);
    void recordLog(String msg);
}
