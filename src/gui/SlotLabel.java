package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import controllers.LabelController;

import models.LabelModel;

public class SlotLabel extends ColoredLabel implements Observer {
	
	private LabelModel label;
	
    public SlotLabel() {
        super("                    ", Color.WHITE, RIGHT);
        label = new LabelModel("                    ");
    	label.addObserver(this);
    	LabelController lblCtrler = new LabelController(label);
    }
    
    
    @Override
	public void update(Observable arg0, Object arg1) {
		setBackground(label.isCurrent() ? Color.YELLOW : Color.WHITE);
		
	}
}