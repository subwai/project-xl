package models;

import java.util.Observable;

public class LabelModel extends Observable {
	private String text;
	private boolean selected;
	
	public LabelModel(String text) {
		this.text = text;
	}
	
	public void setCurrent() {
		selected = true;
		setChanged();
		notifyObservers();
	}
	
	public boolean isCurrent() {
		return selected;
	}
}
