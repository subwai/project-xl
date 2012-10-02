package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import models.CurrentModel;

public class CurrentLabel extends ColoredLabel implements Observer {
	
	private CurrentModel model;
	
    public CurrentLabel(CurrentModel model) {
        super("A1", Color.WHITE);
        this.model = model;
        this.model.addObserver(this);
    }

	@Override
	public void update(Observable o, Object arg) {
		setText(model.getSlot().getName());
	}
}