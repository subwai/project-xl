package models;

import java.util.HashMap;
import java.util.Observable;

import util.XLException;

import expr.Environment;

public class Sheet extends Observable implements Environment {
	HashMap<String, SlotModel> map = new HashMap<String, SlotModel>();
	String error;

	public Sheet() {
		map = new HashMap<String, SlotModel>();
		error = "";
	}

	public void add(String key, SlotModel value) throws Exception {
		remove(key);
		CircularContent cc = new CircularContent(value);
		try{
			cc.value(this);
		} catch (XLException e){
		error = e.getMessage();
		inform();
		}
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
	
	private void check(SlotModel s) throws Exception {
		CircularContent cc = new CircularContent(s);
		try { cc.value(this);}
		catch (XLException e) {
			error = e.getMessage();
		}
				
	}

	public double value(String name){
				check(map.get(name));
				return map.get(name).getValue(this);
			
		

	}

	public String toString(String name) {
		return map.get(name).toString();
	}

	public String state(){
		return error;
	}
}
