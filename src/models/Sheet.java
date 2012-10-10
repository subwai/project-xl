package models;

import java.util.HashMap;
import java.util.Observable;

import util.XLException;

import expr.Environment;

public class Sheet extends Observable implements Environment {
	HashMap<String, SlotModel> map = new HashMap<String, SlotModel>();

	public Sheet() {
		map = new HashMap<String, SlotModel>();
	}

	public void add(String key, SlotModel value){
		remove(key);
		map.put(key, value);
		inform();
	}

	public void remove(String key) {
		if (map.containsKey(key)) {
			map.remove(key);
			inform();
		}
	}

	private void inform() {
		setChanged();
		notifyObservers();
	}
	
	

	public double value(String name){
	return map.get(name).getValue(this);

			
		

	}

	public String toString(String name) {
		return map.get(name).toString();
	}

//	public String state(){
//		return error;
//	}
}
