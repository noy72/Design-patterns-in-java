package State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("Use the safe");
    private Button buttonAlarm = new Button("Emergency bell");
    private Button buttonPhone = new Button("Call");
    private Button buttonExit = new Button("Exit");

    private State state = DayState.getInstance();

    public SafeFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);

        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void setClock(int hour) {
        String clockString = String.format("now: %01d:00", hour);
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }

    @Override
    public void changeState(State state) {
        System.out.println(this.state + " -> " + state);
        this.state = state;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if(e.getSource() == buttonUse)          state.doUse(this);
        else if(e.getSource() == buttonAlarm)   state.doAlarm(this);
        else if(e.getSource() == buttonPhone)   state.doPhone(this);
        else if(e.getSource() == buttonExit)    System.exit(0);
        else System.out.println("?");
    }
}
