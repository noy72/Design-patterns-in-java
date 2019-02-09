package State;

public class NightState implements State{
    private static NightState singleton = new NightState();

    private NightState() {
    }
    public static NightState getInstance(){
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(9 <= hour && hour < 17){
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Emergency: Use the safe in night time!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Emergency bell (Night time)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("Call history in night time");
    }

    @Override
    public String toString() {
        return "Night time";
    }
}
