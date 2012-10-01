package models;

import gui.SlotLabel;

import java.awt.Color;
import java.util.Observable;

public class CurrentSlot extends Observable {
	private SlotLabel current;
	
	public void setCurrent(SlotLabel slot) {
		if (current != null) {
			current.setBackground(Color.WHITE);
		}
		current = slot;
		setChanged();
		notifyObservers();
	}
	
	public SlotLabel getCurrent() {
		return current;
	}
}
