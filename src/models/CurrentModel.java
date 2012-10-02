package models;

import java.util.Observable;

public class CurrentModel extends Observable {
	private SlotModel slot;
	
	public void setCurrent(SlotModel slot) {
		this.slot = slot;
		setChanged();
		notifyObservers(0);
	}
	
	public SlotModel getSlot() {
		return slot;
	}
}
