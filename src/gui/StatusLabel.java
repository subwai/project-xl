package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import models.Sheet;

public class StatusLabel extends ColoredLabel implements Observer {
	private Sheet sheet;
    public StatusLabel(Sheet sheet) {
        super("", Color.WHITE);
        this.sheet = sheet;
        sheet.addObserver(this);
    }

    public void update(Observable observable, Object object) {
        setText(sheet.state());
    }
}