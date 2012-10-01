package models;

import java.util.Observable;

public class EditModel extends Observable {
	private String text;
	
	public void setText(String text) {
		this.text = text;
		setChanged();
		notifyObservers();
	}
	
	public String getText() {
		return text;
	}
}
