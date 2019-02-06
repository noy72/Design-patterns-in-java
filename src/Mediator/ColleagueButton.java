package Mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague{
    private Mediator mediator;

    public ColleagueButton(String caption){
        super(caption);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setCollegueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
