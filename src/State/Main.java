package State;

public class Main {
    public static void main(String[] args){
        SafeFrame frame = new SafeFrame("State Sample");
        while(true){
            for(int hour = 0; hour < 24; hour++){
                frame.setClock(hour);
                try{
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                }
            }
        }
    }
}
