package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import models.CurrentModel;
import models.Sheet;

public class StatusLabel extends ColoredLabel implements Observer {
	private CurrentModel currentModel;
    public StatusLabel(CurrentModel currentModel) {
        super("", Color.WHITE);
        this.currentModel = currentModel;
        currentModel.addObserver(this);
    }

    public void update(Observable observable, Object object) {
        setText(currentModel.ErrorState());
    }
}